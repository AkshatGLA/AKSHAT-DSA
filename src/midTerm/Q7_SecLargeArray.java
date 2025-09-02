package midTerm;

/*
 * Q:-7 EASSY Second Largest Element in an Array. 
Given an array of positive integers arr[] of size n, the task is to find 
second largest distinct element in the array. 
Note: If the second largest element does not exist, return -1. 
Examples:-1 
Input: arr[] = [12, 35, 1, 10, 34, 1] 
Output: 34 
Explanation: The largest element of the array is 35 and the second 
largest element is 34. 
Example:-2 
Input: arr[] = [10, 5, 10] 
Output: 5 
Explanation: The largest element of the array is 10 and the second 
largest element is 5. 
Input: arr[] = [10, 10, 10] 
Output: -1 
Explanation: The largest element of the array is 10 there is no second 
largest element.
 */
public class Q7_SecLargeArray {
//    public static int max(int arr[]){
//        int max=Integer.MIN_VALUE;
//        for(int i=0;i<arr.length;i++){
//            if(arr[i]>max){
//                max=arr[i];
//            }
//        }
//
//    }
    public static int secondmax(int nums[]){
        int largest=Integer.MIN_VALUE;
        int second_largest=Integer.MIN_VALUE;
        for(int i=0;i<nums.length;i++){
            if(nums[i]>largest){
                second_largest=largest;
                largest=nums[i];
            }
            else if(nums[i]>second_largest && nums[i]==largest){
                second_largest=nums[i];

            }
        }
        System.out.println(largest);
        return second_largest;

    }
    public static void main(String[] args) {
        int arr[]={-99,-80,103,-70,0};
        System.out.println(secondmax(arr));
    }
}
