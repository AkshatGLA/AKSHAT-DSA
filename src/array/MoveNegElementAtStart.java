package array;

import java.util.Arrays;

public class MoveNegElementAtStart {
    public static int[] separateNegativeAndPositive(int a[]) {

        int negIdx=0;
        for(int i=0;i<a.length;i++){
            if((a[i]<0)){
                int temp=a[i];
                a[i]=a[negIdx];
                a[negIdx]=temp;
                negIdx++;
            }
        }
        return a;
    }
    public static void main(String[] args) {
        int arr[]={1,2,42,1,3,-1,3,1,-4};
        System.out.println(Arrays.toString(separateNegativeAndPositive(arr)));
    }
}
