
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;


public class MergingMeetingTimes {

    public static class Meeting {

        private int startTime;
        private int endTime;

        public Meeting(int startTime, int endTime) {
            // number of 30 min blocks past 9:00 am
            this.startTime = startTime;
            this.endTime = endTime;
        }

        public int getStartTime() {
            return startTime;
        }

        public void setStartTime(int startTime) {
            this.startTime = startTime;
        }

        public int getEndTime() {
            return endTime;
        }

        public void setEndTime(int endTime) {
            this.endTime = endTime;
        }

        @Override
        public boolean equals(Object o) {
            if (o == this) {
                return true;
            }
            if (!(o instanceof Meeting)) {
                return false;
            }
            final Meeting meeting = (Meeting) o;
            return startTime == meeting.startTime && endTime == meeting.endTime;
        }

        @Override
        public int hashCode() {
            int result = 17;
            result = result * 31 + startTime;
            result = result * 31 + endTime;
            return result;
        }

        @Override
        public String toString() {
            return String.format("(%d, %d)", startTime, endTime);
        }
    }

    // merge meetings ranges
    public static List<Meeting> mergeRanges(List<Meeting> meetings) {
        List<Meeting> mergedMeetings = new ArrayList();

        // Make a copy of the original meetings list
        List<Meeting> sortedMeetings = new ArrayList();
        for (Meeting meeting : meetings){
            Meeting m = new Meeting(meeting.getStartTime(), meeting.getEndTime());
            sortedMeetings.add(m);
        }

        // sort list of meetings by start time
        Collections.sort(sortedMeetings, new Comparator<Meeting>() {
            @Override
            public int compare(Meeting m1, Meeting m2) {
                return m1.getStartTime() - m2.getStartTime();
            }
        });

        mergedMeetings.add(sortedMeetings.get(0));
        for (Meeting currentMeeting: sortedMeetings){

            Meeting lastMergedMeeting = mergedMeetings.get(mergedMeetings.size() -1);

            // if the current meeting overlaps with the last merged meeting, use the
            // later end time of the two
            if (currentMeeting.getStartTime() <= lastMergedMeeting.getEndTime()) {
                lastMergedMeeting.setEndTime(Math.max(lastMergedMeeting.getEndTime(), currentMeeting.getEndTime()));

                // add the current meeting since it doesn't overlap
            } else {
                mergedMeetings.add(currentMeeting);
            }
        }

        return mergedMeetings;
    }

    public static void main(String[] args) {
        List<Meeting> input = new ArrayList<>();
        input.add(new Meeting(3,5));
        input.add(new Meeting(0,1));
        input.add(new Meeting(10,12));
        input.add(new Meeting(4,8));
        input.add(new Meeting(9,10));
        List<Meeting> output = mergeRanges(input);
        System.out.println("Result: " + output);
    }
}