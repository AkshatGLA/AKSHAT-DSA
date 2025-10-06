package array;

import java.util.*;

public class MaxSum {
    public static void main(String[] args) {
        int arr[]={1,1,1,2,2,2};
        int k=6;
        List<Integer> list=new ArrayList<>();
        Arrays.sort(arr);
        int i=arr.length-1;
        while(i>=0 && k>0){
            if(!list.contains(arr[i])){
                list.add(arr[i]);
                k--;
            }
            i--;
        }
        int ans[]=new int[list.size()];
        for(int j=0;j<list.size();j++) ans[j]=list.get(j);
        System.out.println(Arrays.toString(ans));
    }
}
