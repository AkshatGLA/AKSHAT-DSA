package midTerm;

import java.util.Arrays;

/*
Q:-9 EASSY Find First and Last Position of Element in Sorted Array.
Given an array of integers nums sorted in non-decreasing order, find the
starting and ending position of a given target value.
If target is not found in the array, return [-1, -1].
You must write an algorithm with O(log n) runtime complexity.
Example 1:
Input: nums = [5,7,7,8,8,10], target = 8
Output: [3,4]
Example 2:
Input: nums = [5,7,7,8,8,10], target = 6
Output: [-1,-1]
Example 3:
Input: nums = [], target = 0
Output: [-1,-1]
Constraints:
0 <= nums.length <= 105 -109 <= nums[i] <= 109
nums is a non-decreasing array. -109 <= target <= 109
 */
public class Q9_FirstLastPositionElementInArray {
    public static int first(int arr[],int target){
        int st=0,end=arr.length-1,idx=-1;
        while(st<=end){
            int mid=st+(end-st)/2;
            if(arr[mid]==target){
                end=mid-1;
                idx=mid;
            }
            else if(arr[mid]<target){
                st=mid+1;
            }else{
                end=mid-1;
            }
        }
        return idx;
    }
    public static int last(int arr[],int target){
        int st=0,end=arr.length-1,idx=-1;
        while(st<=end){
            int mid=st+(end-st)/2;
            if(arr[mid]==target){
                st=mid+1;
                idx=mid;
            }
            else if(arr[mid]<target){
                st=mid+1;
            }else{
                end=mid-1;
            }
        }
        return idx;
    }
    public static void firstLast(int arr[],int target){
        int ans[]=new int[2];
        ans[0]=first(arr,target);
        ans[1]=last(arr,target);
        System.out.println(Arrays.toString(ans));
    }
    public static void main(String[] args) {
        int arr1[]={5,7,7,8,8,10};
        int t1=8;
        int arr2[]={5,7,7,8,8,10};
        int t2=6;
        firstLast(arr1,t1);
        firstLast(arr2,t2);

    }
}
