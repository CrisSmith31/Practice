package ArraysAndStrings;

/**
 * Given 2 strings write a method to determine if one is a permutation of the other
 */

public class Q2_IsPermutation {


    static boolean isPermutation (String word1, String word2){
        if (word1.length() != word2.length())
            return false;

        return sort(word1).equals(sort(word2));
    }

    static String sort(String str){
        char[] letters = str.toCharArray();
        java.util.Arrays.sort(letters);
        return new String(letters);
    }

    public static void main(String[] args) {
        String word1 = "abcdef";
        String word2 = "dceba";
        System.out.println("Is permutation: " + isPermutation(word1, word2));
    }
}
