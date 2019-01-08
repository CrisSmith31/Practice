
/**
 * Write a method reverseWords() that takes a message as an array of characters and reverses the order of the words in place.
 *   char[] message = { 'c', 'a', 'k', 'e', ' ',
                        'p', 'o', 'u', 'n', 'd', ' ',
                        's', 't', 'e', 'a', 'l' };
 reverseWords(message);

 System.out.println(message);
 // prints: "steal pound cake"
 */

public class ReverseWordsInPlace{


    private static void reverseArrayOfChars(char[] message, int startIndex, int endIndex) {
        while (startIndex < endIndex) {
            char temp = message[startIndex];
            message[startIndex] = message[endIndex];
            message[endIndex] = temp;
            startIndex++;
            endIndex--;
        }
    }

    public static void reverseWords(char[] message){
            reverseArrayOfChars(message, 0, message.length-1);
            int currentIndex = 0;
            for(int i=0; i< message.length; i++){

                if(message[i] == ' ' || i == message.length){
                    reverseArrayOfChars(message, currentIndex, i-1);
                    currentIndex = i+1;
                }
            }
            }

    public static void main(String[] args) {
        String string = "too me";
        char[] input = string.toCharArray();
        System.out.print("Original: [");
        for (char c: input){
            System.out.print(c + ", ");
        }
        System.out.print("]");

        reverseWords(input);
        System.out.println();
        System.out.print("Reversed: [");
        for (char c: input){
            System.out.print(c + ", ");
        }
    }

}
