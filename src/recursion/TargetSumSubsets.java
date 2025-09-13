package recursion;

import java.util.Scanner;

public class TargetSumSubsets {
    public static void printTargetSumSubsets(int arr[], int idx, String set, int sos, int tar){
        if(idx==arr.length){
            if(sos==tar){
                System.out.println(set+" ");
            }
            return;
        }

        printTargetSumSubsets(arr,idx+1,set+arr[idx]+", ",sos+arr[idx],tar);
        printTargetSumSubsets(arr,idx+1,set,sos,tar);
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter size of Array: ");
        int n=sc.nextInt();
        int arr[]=new int [n];
        for(int i=0;i<n;i++) arr[i]=sc.nextInt();
        System.out.print("Enter target: ");
        int tar=sc.nextInt();

        printTargetSumSubsets(arr, 0, "", 0,tar);
    }
}
