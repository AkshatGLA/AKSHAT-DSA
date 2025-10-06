package array;

import java.util.Arrays;

public class Temp {
    public static void main(String[] args) {
        int arr[][]={{4,7},{1,4}};
        Arrays.sort(arr, (a, b) -> Integer.compare(a[0], b[0]));
        for (int[] interval : arr) {
            System.out.println(Arrays.toString(interval));
        }
    }
}
