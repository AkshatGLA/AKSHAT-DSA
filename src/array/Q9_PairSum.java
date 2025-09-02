package array;

import java.util.ArrayList;
import java.util.List;

public class Q9_PairSum {
    public static int pairSum(int arr[], int n, int target) {
        List<Integer> list=new ArrayList<>();
        for(int num:arr){
            list.add(num);
        }
        int count=0;
        for(int i=0;i<n;i++){
            int search=target-arr[i];
            if(list.contains(search)){
                count++;
            }
        }
        if((count/2)>0) return count/2;
        return -1;
    }
    public static void main(String[] args) {
        int arr[]={1, 2, 3, 5, 6, 8, 10, 18, 20, 25};
        int target=6;
        int n=arr.length;

        System.out.println(pairSum(arr,n,target));
    }
}
