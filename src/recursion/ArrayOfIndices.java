package recursion;
import java.util.Arrays;

public class ArrayOfIndices {
    public static int[] indices(int arr[],int idx,int fsf,int k){
        if(idx==arr.length){
            return new int[fsf];
        }

        if(arr[idx]==k){
            int [] ans=indices(arr,idx+1,fsf+1,k);
            ans[fsf]=idx;
            return ans;
        }else{
            int ans[]=indices(arr,idx+1,fsf,k);
            return ans;
        }
    }
    public static void main(String[] args) {
        int arr[]={2,3,6,9,8,3,2,3,6,4};

        System.out.println(Arrays.toString(indices(arr, 0, 0,3)));

        System.out.println(Arrays.toString(indices(arr, 0, 0,2)));

    }
}
