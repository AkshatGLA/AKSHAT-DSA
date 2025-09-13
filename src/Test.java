import java.util.ArrayList;
import java.util.Arrays;

public class Test {
    public static void main(String[] args) {
        int arr[]={1,2,3};
        int arr2[]= Arrays.copyOf(arr,4);
        System.out.println(arr2[3]);
        System.out.println(Arrays.toString(arr2));
    }
}
