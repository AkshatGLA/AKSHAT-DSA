package recursion;

import java.util.ArrayList;
import java.util.Arrays;

public class GetKeyPadCombination {
    static String[] keys={".;","", "abc", "def", "ghi", "jkl", "mno","pqrs", "tuv", "wxyz"};
    public static ArrayList<String> allComb(String str){
        //678
        if(str.length()==0){
            ArrayList<String> res=new ArrayList<>();
            res.add("");
            return res;
        }
        char first=str.charAt(0); //6
        String remain=str.substring(1); //78

        ArrayList<String> remainRes=allComb(remain);
        ArrayList<String> fullRes=new ArrayList<>();

        String keyCode=keys[first-48];
        for(int i=0;i<keyCode.length();i++){
            char keyCodeChar=keyCode.charAt(i);
            for(String s:remainRes){
                fullRes.add(keyCodeChar+s);
            }
        }
        return fullRes;
    }
    public static void printCombinations(String str, String ans){
        if(str.length()==0){
            System.out.print(ans+" ");
            return;
        }
        char first=str.charAt(0);
        String remain=str.substring(1);

        String keyForSearch=keys[first-'0'];
        for(int i=0;i<keyForSearch.length();i++){
            char ch=keyForSearch.charAt(i);

            printCombinations(remain,ans+ch);
        }

    }

    public static void main(String[] args) {
//        System.out.println(allComb("678"));
        printCombinations("65","");
        System.out.println();
        System.out.println(Arrays.toString(keys));
    }
}
