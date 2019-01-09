import java.util.HashSet;
import java.util.Set;

/**
 * Write a method that takes an integer flightLength (in minutes) and an array of integers movieLengths (in minutes)
 * and returns a boolean indicating whether there are two numbers in movieLengths whose sum equals flightLength.
 *
 * When building your method:
 * - Assume your users will watch exactly two movies
 * - Don't make your users watch the same movie twice
 * - Optimize for runtime over memory
 */

public class InflightEntertainment {

    public static boolean canTwoMoviesFillFlight(int flightLength, int[] movieLengths){

        Set<Integer> movieLengthsSeen = new HashSet<>();
        for(int firsMovieLength : movieLengths){
            int secondMovieLength = flightLength - firsMovieLength;
            if(movieLengthsSeen.contains(secondMovieLength)){
                return true;
            }
            movieLengthsSeen.add(firsMovieLength);
        }

        return false;
    }

    public static void main(String[] args) {
        final int[] movieLengths = {1, 2, 3, 4, 5, 6};
        System.out.println("Can two movies fill the flight time? - " + canTwoMoviesFillFlight(7, movieLengths));
    }
}
