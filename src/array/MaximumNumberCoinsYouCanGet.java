package array;

import java.util.Arrays;

/*
Example 1:

Input: piles = [2,4,1,2,7,8]
Output: 9
Explanation: Choose the triplet (2, 7, 8), Alice Pick the pile with 8 coins, you the pile with 7 coins and Bob the last one.
Choose the triplet (1, 2, 4), Alice Pick the pile with 4 coins, you the pile with 2 coins and Bob the last one.
The maximum number of coins which you can have are: 7 + 2 = 9.
On the other hand if we choose this arrangement (1, 2, 8), (2, 4, 7) you only get 2 + 4 = 6 coins which is not optimal.

 */
public class MaximumNumberCoinsYouCanGet {
    public static void main(String[] args) {
        int[] piles = {2,4,1,2,7,8};
        // 8 7 4 2 2 1
        // 9,8,7,6,5,1,2,3,4

        // 9 8 7 6 5 4 3 2 1
        Arrays.sort(piles);
        int n = piles.length;
        int result = 0;
        int left = 0, right = n - 1;

        // We have 3n piles, so we will pick n piles in total
        while (left < right) {
            // Alice picks largest (piles[right])
            right--;
            // You pick next largest
            result += piles[right];
            right--;
            // Bob picks smallest
            left++;
        }
        System.out.println(result);
    }
}
