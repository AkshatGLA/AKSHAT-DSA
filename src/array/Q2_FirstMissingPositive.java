package array;

import java.util.*;

public class Q2_FirstMissingPositive {
    public static int max(int arr[],int n){
        int max=Integer.MIN_VALUE;
        for(int i=0;i<n;i++){
            if(arr[i]> max){
                max=arr[i];
            }
        }
        return max;
    }
    public static int firstMissing(int[] arr, int n) {
        // Write your code here.
        boolean flag=false;
        for(int i=0;i<n;i++){
            if(arr[i]==1){
                flag=true;
            }
        }
        if(!flag) return 1;
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));
        for(int i=0;i<arr.length;i++){
            if(arr[i]>0 && i>0 && ((arr[i]-arr[i-1])>1)) return arr[i]+1;
        }
        return max(arr,n)+1;
    }
    public static void main(String[] args) {
        int arr1[]={1, 2, 0};
        int arr3[]={3, 4, -1, 1};
        int arr2[]={7, 8, 9, 11, 12};

        System.out.println(firstMissing(arr1,arr1.length));
        System.out.println(firstMissing(arr2,arr2.length));
        System.out.println(firstMissing(arr3,arr3.length));

    }
}
