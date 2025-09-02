package stack;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Q739_Leetcode {
    public static int nextMax(int arr[],int idx){
        int count=1;
        int val=arr[idx];
        for(int i=idx+1;i<arr.length;i++){
            if(arr[i]<=val){
                count++;
            }
            else if(arr[i]>val){
                return count;
            }
        }
        return 0;
    }
    public static void main(String[] args) {
        int arr[]={73,74,75,71,69,72,76,73};
        System.out.print(nextMax(arr,0));
        int ans[]=new int[arr.length];
        for(int i=0;i<arr.length;i++){
            ans[i]=nextMax(arr,i);
        }
        System.out.print(Arrays.toString(ans));
    }
}
