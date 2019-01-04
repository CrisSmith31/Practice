
/**
 * Reverse input array of characters in place
 */


public class ReverseArrayInPlace {

    public static void reverse(char[] arrayOfChars) {
        int i=0;
        int arrLength = arrayOfChars.length -1 ;
        while(i < arrLength){
            char temp = arrayOfChars[i];
            arrayOfChars[i] = arrayOfChars[arrLength];
            arrayOfChars[arrLength] = temp;
            i++;
            arrLength--;
        }
    }


    public static void main(String[] args) {
        String string = "ABCDE";
        char[] input = string.toCharArray();
        System.out.print("Original: [");
        for (char c: input){
            System.out.print(c + ", ");
        }
        System.out.print("]");

        reverse(input);
        System.out.println();
        System.out.print("Reversed: [");
        for (char c: input){
            System.out.print(c + ", ");
        }
        System.out.print("]");

    }
}
