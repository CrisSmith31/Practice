import java.util.Arrays;

/**
 * Each order is represented by an "order id" (an integer).
 We have our lists of orders sorted numerically already, in arrays. Write a method to merge our arrays of orders into one sorted array.

 For example:

 int[] myArray = new int[]{3, 4, 6, 10, 11, 15};
 int[] alicesArray = new int[]{1, 5, 8, 12, 14, 19};

 System.out.println(Arrays.toString(mergeArrays(myArray, alicesArray)));
 // prints [1, 3, 4, 5, 6, 8, 10, 11, 12, 14, 15, 19]
 */

public class MergeSortedArrays {


    public static int[] mergeArrays(int[] firstArray, int[] secondArray) {

        int[] mergedArray = new int[firstArray.length + secondArray.length];

        int i = 0;
        int j = 0;
        int indexMerged = 0;

        while (indexMerged < mergedArray.length) {
            boolean isFirstArrExhausted = i >= firstArray.length;
            boolean isSecondArrExhausted = j >= secondArray.length;

            if(!isFirstArrExhausted && (isSecondArrExhausted || firstArray[i] < secondArray[j])){
                mergedArray[indexMerged] = firstArray[i];
                i++;
            }else{
                mergedArray[indexMerged] = secondArray[j];
                j++;
            }
            indexMerged++;
        }

        return mergedArray;
    }

    public static void main(String[] args) {
        int [] first = {1,5,7};
        int [] second = {2,3,10};

       int [] result = mergeArrays(first, second);
       System.out.print(Arrays.toString(result));

    }

}
