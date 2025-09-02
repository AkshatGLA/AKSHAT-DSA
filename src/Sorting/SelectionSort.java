package Sorting;

import java.util.Arrays;

public class SelectionSort {
    public static void selectionSort(int arr[]) {
        int n=arr.length;
        // Write your code here.
        for(int i=0;i<n-1;i++){
            int min_index=i;
            for(int j=i+1;j<n;j++){
                if(arr[j]<arr[min_index]){
                    min_index=j;
                }
            }
            if(min_index!=i){
                int temp=arr[min_index];
                arr[min_index]=arr[i];
                arr[i]=temp;
            }
        }
    }

    public static void main(String[] args) {
        int arr[]={1,4,346,67,21,-1,4,1};
        selectionSort(arr);
        System.out.println(Arrays.toString(arr));
    }
}
