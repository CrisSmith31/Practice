package ArraysAndStrings;

/**
 * There are 3 types of edits that can be performed on strings: insert a char, remove a char, or replace a char.
 * Given two strings write a function to check if they are one(or zero) edits away.
 */

public class Q5_OneAway {

    public static boolean checkTwoStringsAreZeroOrOneEditsAway(String first, String second) {

        // check for character replace
        if (first.length() == second.length()) {
            return oneEditReplace(first, second);
        }else if(first.length() - 1 == second.length()){
            return oneEditInsert(second, first);
        }else if(first.length() + 1 == second.length())
            return oneEditInsert(first, second);

        return false;
    }

    public static boolean oneEditReplace (String s1, String s2){
        boolean isReplace = false;
        int count = 0;
        for (int i = 0; i < s1.length(); i++) {
            if (s1.charAt(i) != s2.charAt(i))
                count++;
        }
        if (count > 1)
            isReplace = false;

        return isReplace;
    }

    public static boolean oneEditInsert(String s1, String s2){
        int index1 = 0;
        int index2 = 0;
        while(index1 < s1.length() && index2 < s2.length()){
            if(s1.charAt(index1) != s2.charAt(index2)){
                if(index1 != index2){
                    return false;
                }
            index2++;
            }
            index1++;
            index2++;
        }
        return true;
    }

    public static void main (String[]args){
        String first = "pale";
        String second = "pales";

        System.out.println("Result: " + checkTwoStringsAreZeroOrOneEditsAway(first, second));
    }
}