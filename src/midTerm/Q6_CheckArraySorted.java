package midTerm;
/*
 * Q:-6 EASSY Check if array is sorted.
Given an array arr[], check whether it is sorted in non-decreasing order. Return true if it is sorted otherwise false.
Examples:-1
Input: arr[] = [10, 20, 30, 40, 50]
Output: true
Example:-2
Explanation: The given array is sorted.
Input: arr[] = [90, 80, 100, 70, 40, 30]
Output: false
Explanation: The given array is not sorted.
Constraints:
1 ≤ arr.size ≤ 106
- 109 ≤ arr[i] ≤ 109

 */
public class Q6_CheckArraySorted {
    public static boolean isSorted(int arr[]) {
        for(int i=1;i<arr.length;i++){
            if(arr[i-1]>arr[i]){
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        int arr[]={10, 20, 30, 40, 50};
        int arr2[]={90, 80, 100, 70, 40, 30};
        int arr3[]={1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int arr4[]={10, 9, 8, 7, 6, 5, 4, 3, 2, 1};
        int arr5[]={5, 5, 5, 5, 5};
        int arr6[]={1};
        int arr7[]={};
        
        System.out.println(isSorted(arr));   // true
        System.out.println(isSorted(arr2));  // false
        System.out.println(isSorted(arr3));  // true
        System.out.println(isSorted(arr4));  // false
        System.out.println(isSorted(arr5));  // true
        System.out.println(isSorted(arr6));  // true
        System.out.println(isSorted(arr7));  // true
        
    }
}
