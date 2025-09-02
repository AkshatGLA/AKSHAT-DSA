package midTerm;

import java.util.Arrays;

/*
Q;-20 EASSY Move Zeroes
Given an integer array nums, move all 0's to the end of it while maintaining the relative order of the non-zero elements.

Note that you must do this in-place without making a copy of the array.

Example 1:
Input: nums = [0,1,0,3,12]
Output: [1,3,12,0,0]
Example 2:
Input: nums = [0]
Output: [0]
Constraints:
1 <= nums.length <= 104
-231 <= nums[i] <= 231 – 1

 */
public class Q20_MoveZeros {
    public static void moveZeroes(int[] arr) {
        for(int i=0;i<arr.length;i++){
            for(int j=i+1;j<arr.length;j++){
                if(arr[i]==0 && arr[j]!=0){
                    int temp=arr[i];
                    arr[i]=arr[j];
                    arr[j]=temp;
                }
            }
        }
    }
//    Optimised Code
    public static void moveZerosOpt(int arr[]){
        int previousIdx=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]!=0){
                int temp=arr[i];
                arr[i]=arr[previousIdx];
                arr[previousIdx]=temp;
                previousIdx++;
            }
        }
    }

    public static void main(String[] args) {
        int arr[]={0,1,0,3,12};
        moveZerosOpt(arr);
        System.out.println(Arrays.toString(arr));
    }
}
