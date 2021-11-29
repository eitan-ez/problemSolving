import java.util.Arrays;
import java.util.Collections;

public class KLargestElement {

    /**
     * Given an array Arr of N positive integers, find K largest elements from the array.
     * The output elements should be printed in decreasing order.
     */
    public static void main(String[] args) {
        int k = 3;
        Integer[] arr = {1, 23, 12, 9, 30, 2, 50};
        Arrays.sort(arr, Collections.reverseOrder());
        for (int i = 0; i < k; i++) {
            System.out.print(arr[i] + "\t");
        }
    }
}
