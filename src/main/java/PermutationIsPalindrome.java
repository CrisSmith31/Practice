import java.util.HashSet;
import java.util.Set;

/**
 * Write an efficient method that checks whether any permutation of an input string is a palindrome.
 *You can assume the input string only contains lowercase letters.
 *
 * Examples:
 *
 * "civic" should return true
 * "ivicc" should return true
 * "civil" should return false
 * "livci" should return false
 *
 */

public class PermutationIsPalindrome {

    public static boolean hasPalindromePermutation(String inputString){
        Set<Character> unpairedChars = new HashSet<>();
        for(char c: inputString.toCharArray()){
            if(unpairedChars.contains(c)){
                unpairedChars.remove(c);
            }else
                unpairedChars.add(c);
        }
        return unpairedChars.size() <= 1;
    }

    public static void main(String[] args) {
       // String input = "civic";
       // String input = "abba";
        String input = "dfgjd";
        System.out.println("Has the string '" + input + "' a palindrome? " + hasPalindromePermutation(input));
    }
}
