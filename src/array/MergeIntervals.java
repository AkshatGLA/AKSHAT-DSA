package array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Stack;

/*
Example 1:

Input: intervals = [[1,3],[2,6],[8,10],[15,18]]
Output: [[1,6],[8,10],[15,18]]
Explanation: Since intervals [1,3] and [2,6] overlap, merge them into [1,6].
Example 2:

Input: intervals = [[1,4],[4,5]]
Output: [[1,5]]
Explanation: Intervals [1,4] and [4,5] are considered overlapping.
        Example 3:

Input: intervals = [[4,7],[1,4]]
Output: [[1,7]]
Explanation: Intervals [1,4] and [4,7] are considered overlapping.

 */
public class MergeIntervals {
//    Input: intervals = [[1,3],[2,6],[8,10],[15,18]]
//    Output: [[1,6],[8,10],[15,18]]
    public static void mergeIntervals(int[][] arr) {
        Arrays.sort(arr,(a,b)->Integer.compare(a[0],b[0]));
        Stack<int[]> list = new Stack<>();
        list.push(arr[0]);
        for(int i=1;i<arr.length;i++){
            int prev[]=list.peek();
            if(arr[i][0]<=prev[1] && prev[1]<=arr[i][1]){
                int temp[]=list.pop();
                list.push(new int[]{temp[0],arr[i][1]});
            }
            else if (arr[i][0]>prev[1] && prev[1]<arr[i][1])
                list.push(arr[i]);

        }
        for(int interval[]:list){
            System.out.println(Arrays.toString(interval));
        }
    }
    public static void main(String[] args) {
        int arr[][]={{1,4},{2,3}};
        mergeIntervals(arr);
    }
}
