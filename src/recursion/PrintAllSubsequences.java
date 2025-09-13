package recursion;

import java.util.List;

public class PrintAllSubsequences {

    public static void printSub(String str,String ans){

        if(str.length()==0){
            System.out.print(ans+" ");
            return;
        }
        char first=str.charAt(0);
        String remain=str.substring(1);
        printSub(remain,ans+"");
        printSub(remain,ans+first);
    }
    public static void main(String[] args) {
        printSub("abc","");
    }
}
