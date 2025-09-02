package bridgeLab;

import java.util.*;

public class CallByValueReference {
    public static void passByValue(int x){
        x=x+30;
        System.out.println(x);
    }
    public static void objectPassByValue(List<Integer> list){
        list.add(1);
        list.add(2);
        System.out.println(list);
    }
    public static void main(String[] args) {
        int n=10;
        System.out.println(n);
        passByValue(n);
        System.out.println(n);

        List<Integer> list=new ArrayList<>();
        list.add(12);
        list.add(13);
        System.out.println(list);
        objectPassByValue(list);
        System.out.println(list);
    }
}
