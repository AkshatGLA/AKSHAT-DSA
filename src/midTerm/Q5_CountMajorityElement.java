package midTerm;
/*
 * Q:-5 MEDIUM Majority Element
Given an array nums of size n, return the majority element.
The majority element is the element that appears more than ⌊n / 2⌋ times. You may assume that the majority element always exists in the array.
Example 1:
Input: nums = [3,2,3]
Output: 3
Example 2:
Input: nums = [2,2,1,1,1,2,2]
Output: 2
Constraints:
n == nums.length
1 <= n <= 5 * 104
-109 <= nums[i] <= 109

 */
import java.util.*;
public class Q5_CountMajorityElement {
    public static int majorityElement(int nums[]){
        Arrays.sort(nums);
        if(nums.length==1){
            return nums[0];
        }
        int count=1;
        int maxCount=1;
        int current_element=-1;
        for(int i=1;i<nums.length;i++){
            if(nums[i]==nums[i-1]){
                count++;
                if(count>maxCount){
                    current_element=nums[i];
                }
                maxCount=Math.max(maxCount, count);
            }else count=1;
        }
        return current_element;
    }
    public static void main(String[] args) {
        int nums[]={2,2,1,1,1,2,2};
        int nums2[]={3,2,3};
        System.out.println(majorityElement(nums2));
        System.out.println(majorityElement(nums));
    }
}
