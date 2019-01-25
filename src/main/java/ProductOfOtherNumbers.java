/**
 * You have an array of integers, and for each index you want to find the product of every integer except the integer
 * at that index.
 * For example, given: [1, 7, 3, 4] your method would return: [84, 12, 28, 21]
 * by calculating: [7 * 3 * 4,  1 * 3 * 4,  1 * 7 * 4,  1 * 7 * 3]
 *
 * Here's the catch: You can't use division in your solution!
 */

public class ProductOfOtherNumbers {

    public static int[] getProductsOfAllIntsExceptAtIndex(int[] intArray) {

        if (intArray.length < 2) {
            throw new IllegalArgumentException("Getting the product of numbers at other indices requires at least 2 numbers");
        }

        int [] productsOfAllIntExceptIndex = new  int[intArray.length];

       // calculate product of integers before index
        int productSoFar = 1;
        for (int i = 0; i < intArray.length; i++) {
            productsOfAllIntExceptIndex[i] = productSoFar;
            productSoFar *= intArray[i];
        }

        // calculate product of integers after the index
        productSoFar = 1;
        for (int i = intArray.length - 1; i >=0 ; i--) {
            productsOfAllIntExceptIndex[i] *= productSoFar;
            productSoFar *= intArray[i];
        }
        return productsOfAllIntExceptIndex;
    }


    public static void main(String[] args) {
        int [] input = {1,7,3,4};
        int [] result = getProductsOfAllIntsExceptAtIndex(input);
        for (int i = 0; i < result.length; i++) {
            System.out.println(result[i]);
        }
    }
}
