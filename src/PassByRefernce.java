import java.util.ArrayList;
import java.util.List;

public class PassByRefernce {
    public static List<Integer> pass(List<Integer> arr){
        for(int i=0;i<arr.size();i++){
            arr.set(arr.get(i)-1, arr.get(i)+1);
        }
        return arr;
    }
    public static void main(String[] args) {
        List<Integer> arr=new ArrayList<>();
        arr.add(1);
        arr.add(2);
        arr.add(3);
        arr.add(4);
        System.out.println("original Array: "+arr);
        List<Integer> ans=pass(arr);
        System.out.println(ans);
        System.out.println(arr);
    }   
}
