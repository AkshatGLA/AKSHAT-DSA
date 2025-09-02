package placement.prep;
import java.util.*;
public class RotateArray {

    public static void reverse(ArrayList<Integer> arr, int st, int end){
        while(st<=end){
            int temp=arr.get(st);
            arr.set(st, arr.get(end));
            arr.set(end, temp);
            st++;
            end--;
        }
    }
    public static ArrayList<Integer> rotateArray(ArrayList<Integer> arr, int k) {

        int n=arr.size();
        System.out.println(n);
        k=k%n;

        reverse(arr, 0, k - 1);
        reverse(arr, k, n - 1);
        reverse(arr, 0, n - 1);



        return arr;
/*
'arr '= [1,2,3,4,5]
'k' = 1  rotated array = [2,3,4,5,1]
'k' = 2  rotated array = [3,4,5,1,2]
'k' = 3  rotated array = [4,5,1,2,3] and so on.
 */
    }

    public static void main(String[] args) {
        ArrayList<Integer> arr=new ArrayList<>();
        arr.add(1);
        arr.add(2);
//        arr.add(3);
//        arr.add(4);
//        arr.add(5);
        System.out.println(arr);
        System.out.println(rotateArray(arr,1));
    }
}
