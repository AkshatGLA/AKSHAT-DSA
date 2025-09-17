package array;

import java.util.Arrays;

public class AgressiveCows {
    public static boolean canPlaceCows(int arr[], int n, int cows, int distance){
        int coOrd=arr[0];
        int count=1;
        for(int i=1;i<n;i++){
            if(arr[i]-coOrd>=distance){
                count++;
                coOrd=arr[i];
            }
            if(count==cows) return true;
        }
        return false;
    }
    public static void main(String[] args) {
        int stall[]={1,2,4,8,9};
        int cows=3;
        int n = stall.length;

        // Sort the stalls (always important!)
        Arrays.sort(stall);

        int left = 1;
        int right = stall[n - 1] - stall[0];
        int result=0;
        while(left<=right){
            int mid=(left+right)/2;
            if(canPlaceCows(stall,n,cows,mid)){
                result=mid;
                left=mid+1;
            }else{
                right=mid-1;
            }
        }
        System.out.println(result);
    }
}
