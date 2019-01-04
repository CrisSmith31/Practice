package ArraysAndStrings;

/**
 * Implement an algorithm to determine if a string has all unique characters
 * You cannot use additional data structures.
 */

public class Q1_IsUnique {

    static boolean stringIsUnique(String word){
        if(word.length() > 128)
            return false;

        boolean[] char_set = new boolean[128];
        for (int i = 0; i < word.length() ; i++) {
            int value = word.charAt(i);
            if(char_set[value]){
                return false;
            }
            char_set[value] = true;
        }

        return true;
    }

    public static void main(String[] args) {
        String word = "abcde";
        System.out.println("The word (" + word + ") contains unique characters = " + stringIsUnique(word));
    }
}
