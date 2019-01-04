package ArraysAndStrings;

/**
 * Write a method to replace all spaces in a string with '%20'. You may assume that the string has sufficient space at the end
 * to hold the additional characters, and that you are given the "true" length of the string
 */

public class Q3_URLify {

    static String getChangedString(String str){

      String result = "";
      for (int i=0; i < str.length(); i++){
          result = str.replace(" ", "%20");
      }
        return result;
    }

    public static void main(String[] args) {
        String input = "Mr John Smith      ";
        System.out.println("Result = " + getChangedString(input));
    }
}

/*

string = "Mr John Smith      "
result = "Mr%20John%20Smith"
 */