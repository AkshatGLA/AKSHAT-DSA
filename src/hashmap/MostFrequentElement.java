package hashmap;
import java.util.*;
public class MostFrequentElement {
    public static void mostFrequent(int arr[]){
        Map<Integer, Integer> map=new HashMap<>();
        for(int i=0;i<arr.length;i++){
            if(map.containsKey(arr[i])){
                map.put(arr[i], map.get(arr[i])+1);
            }else{
                map.put(arr[i], 1);
            }
        }
        System.out.println(map);
        int maxCount=0;
        for(int key: map.keySet()){
            if(map.get(key)>maxCount){
                maxCount=map.get(key);
            }
        }
        System.out.println("Max Count: "+maxCount);

    }
    public static void main(String[] args) {
        int arr[]={1, 2, 3, 4, 5, 1, 2, 3, 1};
        mostFrequent(arr);
    }
}
