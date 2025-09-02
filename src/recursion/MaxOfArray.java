package recursion;

import java.util.Map;

public class MaxOfArray {
    public static int greatest(int arr[],int idx){
        if(idx==arr.length) return 0;
        return Math.max(arr[idx],greatest(arr,idx+1));
    }
    public static void main(String[] args) {
        int arr[]={3,4,2,4,1,1,34,5,6,1,1334};
        System.out.println(greatest(arr,0));
    }
}
