package midTerm;

import java.util.Arrays;

/*
 * Q:-2 MEDIUM Rotate Array.
Given an integer array nums, rotate the array to the right by k steps, where k is non-negative.
Example 1:
Input: nums = [1,2,3,4,5,6,7], k = 3
Output: [5,6,7,1,2,3,4]
Explanation:
rotate 1 steps to the right: [7,1,2,3,4,5,6]
rotate 2 steps to the right: [6,7,1,2,3,4,5]
rotate 3 steps to the right: [5,6,7,1,2,3,4]
Example 2:
Input: nums = [-1,-100,3,99], k = 2
Output: [3,99,-1,-100]
Explanation: 
rotate 1 steps to the right: [99,-1,-100,3]
rotate 2 steps to the right: [3,99,-1,-100]
Constraints:
1 <= nums.length <= 105
-231 <= nums[i] <= 231 - 1
0 <= k <= 105

 */
public class Q2_RotateArray {
    public static void swap(int arr[],int a,int b){
        while(a<=b){
            int temp=arr[a];
            arr[a]=arr[b];
            arr[b]=temp;
            a++;
            b--;
        }
    }
    public static void rotate(int arr[],int k){
        int n=arr.length;
        swap(arr,0,n-1);
        swap(arr,0,k-1);
        swap(arr,k,n-1);
        System.out.println(Arrays.toString(arr));

    }
    public static void main(String[] args) {
        int arr1[]={1,2,3,4,5,6,7};
        int arr2[]={-1,-100,3,99};
        int k1=3;
        int k2=2;
        rotate(arr1,k1);
        rotate(arr2,k2);
    }
}
