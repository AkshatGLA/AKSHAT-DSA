package array;

import java.util.Arrays;

public class SubsequenceSumAfterCappingElements {

    // Recursive function to check if sum = k is possible
    public static boolean canSum(int[] arr, int idx, int currSum, int k) {
        if (currSum == k) return true;
        if (idx == arr.length || currSum > k) return false;
        if (canSum(arr, idx + 1, currSum + arr[idx], k)) return true;
        if (canSum(arr, idx + 1, currSum, k)) return true;

        return false;
    }

    public static void main(String[] args) {
        int k = 3;
        int arr[] = {1,2,3,4,5};
        int n = arr.length;

        boolean[] ans = new boolean[n];

        for (int x = 1; x <= n; x++) {
            // create capped array for this x
            int[] capped = new int[n];
            for (int j = 0; j < n; j++) {
                capped[j] = Math.min(arr[j], x);
            }

            // check subsequence sum recursively
            ans[x - 1] = canSum(capped, 0, 0, k);
        }

        System.out.println(Arrays.toString(ans));
    }
}
