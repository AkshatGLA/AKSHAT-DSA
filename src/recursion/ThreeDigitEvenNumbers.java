package recursion;

import java.util.*;

public class ThreeDigitEvenNumbers {
    public static List<Integer> findEvenNumbers(int[] digits) {
        Set<Integer> result = new TreeSet<>(); // TreeSet keeps numbers sorted & unique
        int n = digits.length;

        // Triple nested loop → try all (a,b,e) combinations
        for (int i = 0; i < n; i++) {          // first digit (hundreds place)
            for (int j = 0; j < n; j++) {      // middle digit (tens place)
                for (int k = 0; k < n; k++) {  // last digit (ones place)

                    // Conditions:
                    if (i == j || j == k || i == k) continue; // must use distinct indices
                    if (digits[i] == 0) continue;              // no leading zero
                    if (digits[k] % 2 != 0) continue;          // last digit must be even

                    int num = digits[i] * 100 + digits[j] * 10 + digits[k];
                    result.add(num);
                }
            }
        }

        return new ArrayList<>(result);
    }

    public static void main(String[] args) {
        int[] nums1 = {6,6,6};
        System.out.println(findEvenNumbers(nums1));
        // Output: [124, 132, 134, 142, 214, 234, 312, 314, 324, 342, 412, 432]

        int[] nums2 = {0};
        System.out.println(findEvenNumbers(nums2)); // Output: []
    }
}
