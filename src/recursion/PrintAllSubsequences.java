package recursion;

import java.util.ArrayList;
import java.util.List;

public class PrintAllSubsequences {

//    public static void printSub(String str,String ans){
//        if(str.length()==0){
//            System.out.print(ans+" ");
//            return;
//        }
//        char first=str.charAt(0);
//        String remain=str.substring(1);
//        printSub(remain,ans+"");
//        printSub(remain,ans+first);
//    }
    public static void allSub(String str, String ans,List<List<String>> sub){
        if(str.length()==0){
            List<String> list=new ArrayList<>();
            list.add(ans);
            sub.add(list);
            return;
        }
        char first=str.charAt(0);
        String remain=str.substring(1);
        allSub(remain,ans+"",sub);
        allSub(remain,ans+first,sub);
    }
    public static void main(String[] args) {
//        printSub("abc","");
        List<List<String>> list=new ArrayList<>();
        allSub("1234","",list);
        System.out.println(list);

    }
}
