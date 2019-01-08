/**
 * Write a method to tell us if a full deck of cards shuffledDeck is a single riffle of two other halves half1 and half2.
 We'll represent a stack of cards as an array of integers in the range 1..521..52 (since there are 5252 distinct cards in a deck).
 */

public class SingleRiffleShuffle {

    public static boolean isSingleRiffle(int[] half1, int[] half2, int[] shuffleDeck){
        boolean isSingleShuffle = true;
        int h1Length = half1.length;
        int h2Length = half2.length;
        int shuffleDeckLength = shuffleDeck.length;

        int indexH1 = 0;
        int indexH2 = 0;
        int indexShuffle = 0;

        // check if the lengths of the halves is greater or smaller than the shuffle deck length.
        if(h1Length + h2Length > shuffleDeckLength || h1Length + h2Length < shuffleDeckLength)
            return false;

        // check if one of the half lengths is 0
        if((h1Length == 0 && h2Length != shuffleDeckLength)
                || (h2Length == 0 && h1Length != shuffleDeckLength))
            return false;

        for(int card : shuffleDeck){

            if(indexH1 < h1Length && card == half1[indexH1]){
                indexH1 ++;
            } else if(indexH2 < h2Length && card == half2[indexH2]){
                indexH2 ++;
            }else{
                isSingleShuffle = false;
            }
        }

        return isSingleShuffle;

    }

    public static void main(String[] args) {
        final int[] half1 = {1, 4, 5};
        final int[] half2 = {2, 3, 6};
        final int[] shuffledDeck = {1, 2, 3, 4, 5, 6};
        final boolean result = isSingleRiffle(half1, half2, shuffledDeck);
        System.out.println("Result : " + result);
    }
}
