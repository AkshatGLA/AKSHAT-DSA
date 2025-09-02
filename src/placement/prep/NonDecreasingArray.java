package placement.prep;
//-71 -46 -41 -8 7 35 219 -150 57 59
import java.util.*;
public class NonDecreasingArray {
    public static boolean isPossible(int[] arr, int n) {
        int[] copy = Arrays.copyOf(arr, n);
        Arrays.sort(arr);
        int count=0;
        for(int i=1;i<arr.length-1;i++){
            if(arr[i]!=copy[i]){
                count++;
                if(count>1) return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        int arr[]={-71, -46, -41, -8, 7, 35, 219, -150, 57, 59};
        System.out.println(isPossible(arr,arr.length));
    }
}
