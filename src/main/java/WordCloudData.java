import java.util.*;

/**
 * You want to build a word cloud, an infographic where the size of a word corresponds to how often it appears in
 * the body of text.
 * To do this, you'll need data. Write code that takes a long string and builds its word cloud data in a hash map,
 * where the keys are words and the values are the number of times the words occurred.
 *
 * Think about capitalized words. For example, look at these sentences:
 * "After beating the eggs, Dana read the next step: Add milk and eggs, then add flour and sugar."
 * What do we want to do with "After", "Dana", and "add"? In this example, your final hash map should include
 * one "Add" or "add" with a value of 22.
 * Make reasonable (not necessarily perfect) decisions about cases like "After" and "Dana".
 *
 * Assume the input will only contain words and standard punctuation.
 */

public class WordCloudData {

   public static List<String> splitWords(String paragraph){
       List<String> listOfWords = new ArrayList<>();
       
       int currentWordStartIndex = 0;
       int currentWordLength = 0;
       for (int i = 0; i < paragraph.length(); i++) {
           char c = paragraph.charAt(i);
           if(Character.isLetter(c)){
               if(currentWordLength == 0){
                   currentWordStartIndex = i;
               }
               currentWordLength++;
           }else{
               String currentWord = paragraph.substring(currentWordStartIndex,
                       currentWordStartIndex + currentWordLength);
               listOfWords.add(currentWord);
               currentWordLength = 0;
           }
       }

       return listOfWords;
   }

    public static HashMap<String, Integer> returnWordCount(List<String> listOfWords){
        HashMap<String, Integer> result = new HashMap<>();
        for(String word: listOfWords){
            if(!result.containsKey(word)){
                result.put(word,1);
            }else{
                result.put(word, result.get(word) + 1);
            }
        }
        return result;
    }



    public static void main(String[] args) {
        String input = "After beating the eggs, Dana read the next step: Add milk and eggs then, add flour and sugar";
        List<String> listOfWords = splitWords(input);
        System.out.println("List of words = ");
        for(String word : listOfWords){
            System.out.print(word + ", ");
        }
        System.out.println();
        HashMap<String, Integer> result = returnWordCount(listOfWords);
        for(Map.Entry<String, Integer> entry : result.entrySet()){

            String key =entry.getKey();
            Integer value = entry.getValue();
            System.out.println("KEY: " + key + " " + "VALUE: " + value);

        }
    }
}
