package midTerm;
/*
 * Q:-3EASSY Array Reverse 
Given an array arr[], the task is to reverse the array. Reversing an array means rearranging the elements such that the first element becomes the last, the second element becomes second last and so on.

Examples:1
Input: arr[] = {1, 4, 3, 2, 6, 5}  
Output: {5, 6, 2, 3, 4, 1}
Explanation: The first element 1 moves to last position, the second element 4 moves to second-last and so on.

Examples:1
Input: arr[] = {4, 5, 1, 2} 
Output: {2, 1, 5, 4}
Explanation: The first element 4 moves to last position, the second element 5 moves to second last and so on.

 */

import java.util.Arrays;

public class Q3_ReverseArray {
    public static void swap(int arr[],int a,int b){
        while(a<=b){
            int temp=arr[a];
            arr[a]=arr[b];
            arr[b]=temp;
            a++;
            b--;
        }
    }
    public static void reverse(int arr[]){
        swap(arr,0,arr.length-1);
        System.out.println(Arrays.toString(arr));
    }
    public static void main(String[] args) {
        int arr1[]={1, 4, 3, 2, 6, 5};
        int arr2[]={4, 5, 1, 2};
        reverse(arr1);
        reverse(arr2);
    }
}
