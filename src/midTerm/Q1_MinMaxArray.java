package midTerm;

import java.util.Arrays;

/*
 * Q:-1 EASSY Given an integer array nums of size n, find the maximum and minimum elements in the array and return them as a pair.
Write a function findMinMax that takes in an integer array nums and returns a pair of integers containing the maximum and minimum elements.
You can assume that nums will always have at least one element.
Input:-An integer array nums of size n (1 ≤ n ≤ 10^4) where each element is an integer (-10^9 ≤ nums[i] ≤ 10^9).
Output:-Return an integer array containing two elements: the maximum element followed by the minimum element from nums.
Example 1:
Input: nums = [4, 2, 5, 1, 6, 3]
Output: [6, 1]
Explanation: The maximum element is 6, and the minimum element is 1.
Example 2:
Input: nums = [1, 5, 7, 2, 9, 3]
Output: [9, 1]
Explanation: The maximum element is 9, and the minimum element is 1.

 * 
 */
public class Q1_MinMaxArray {
    public static int max(int arr[]){
        int max=Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++){
            if(arr[i]>max){
                max=arr[i];
            }
        }
        return max;
    }
    public static int min(int arr[]){
        int min=Integer.MAX_VALUE;
        for(int i=0;i<arr.length;i++){
            if(arr[i]<min){
                min=arr[i];
            }
        }
        return min;
    }
    public static void minMax(int arr[]){
        int ans[]=new int[2];
        ans[0]=max(arr);
        ans[1]=min(arr);
        System.out.println(Arrays.toString(ans));
    }
    public static void main(String[] args) {
        int arr1[]={4, 2, 5, 1, 6, 3};
        int arr2[]={1, 5, 7, 2, 9, 3};
        minMax(arr1);
        minMax(arr2);
    }
}
