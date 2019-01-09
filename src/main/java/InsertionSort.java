import java.util.Arrays;


public class InsertionSort {

    public static int [] sortArray(int [] a){

        for (int j = 1; j < a.length ; j++) {
            int key = a[j];
            int i = j-1;
            while (i >= 0 && a[i] > key){
                a[i+1] = a[i];
                i--;
                a[i+1] = key;
            }
        }
        return a;
    }

    public static void main(String[] args) {
        final int[] input = {5,2,4,6,1,3};
        System.out.println("Result: " + Arrays.toString(sortArray(input)));
    }
}
