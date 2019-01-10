/**
 * You created a game that is more popular than Angry Birds.
 *
 * Each round, players receive a score between 0 and 100, which you use to rank them from highest to lowest.
 * So far you're using an algorithm that sorts in O(n\lg{n})O(nlgn) time, but players are complaining that their
 * rankings aren't updated fast enough. You need a faster sorting algorithm.
 *
 * Write a method that takes:
 *
 * an array of unsortedScores
 * the highestPossibleScore in the game
 * and returns a sorted array of scores in less than O(n\lg{n})O(nlgn) time.
 *
 * For example:
 *
 * int[] unsortedScores = {37, 89, 41, 65, 91, 53};
 * final int HIGHEST_POSSIBLE_SCORE = 100;
 *
 * int[] sortedScores = sortScores(unsortedScores, HIGHEST_POSSIBLE_SCORE);
 * // sortedScores: [91, 89, 65, 53, 41, 37]
 *
 * We’re defining n as the number of unsortedScores because we’re expecting the number of players to keep climbing.
 *
 * And, we'll treat highestPossibleScore as a constant instead of factoring it into our big O time and space costs
 * because the highest possible score isn’t going to change. Even if we do redesign the game a little, the scores
 * will stay around the same order of magnitude.
 */

public class TopScores {

    public static int[] sortScores(int[] unsortedScores, int highestPossibleScore){

        // array of 0s at indices 0..highestPossibleScore
        int[] scoreCounts = new int[highestPossibleScore + 1];
        int[] sortedScores = new int[unsortedScores.length];
        int currentSortedIndex = 0;

        // populate an array of score counts where index is the score and count is the value at that index
        for(int score: unsortedScores){
            scoreCounts[score]++;
        }

        // for each item in scoreCounts
        for(int score=highestPossibleScore; score >= 0; score--){
            int count = scoreCounts[score];

            // for the number of times the item occurs
            for(int occurence=0; occurence < count; occurence++){
                // add it to the sorted array
                sortedScores[currentSortedIndex] = score;
                currentSortedIndex ++;
            }
        }
        return sortedScores;
    }

    public static void main(String[] args) {
        final int[] scores = {37, 89, 41, 65, 91, 53};
        final int highest = 100;
        final int[] result = sortScores(scores, highest);
        for (int i = 0; i < result.length; i++) {
            System.out.print(result[i] + " ");
        }
    }
}
