package recursion;
import java.util.*;
public class StringSubsequenceGame {
    public static TreeSet<String> allSub(String s){

        if(s.length()==0){
            TreeSet<String> phaiSet=new TreeSet<>();
            phaiSet.add("");
            return phaiSet;
        }

        char first=s.charAt(0);
        String remaining=s.substring(1);

        TreeSet<String> remainingSub=allSub(remaining);

        TreeSet<String> ans=new TreeSet<>();
        for(String str: remainingSub){
            ans.add(""+str);
            ans.add(first+str);
        }
        return ans;
    }
    public static TreeSet<String> allPossibleSubsequences(String s) {
        // code here
        TreeSet<String> sub=allSub(s);
        TreeSet<String> ans=new TreeSet<>();

        for(String word:sub){
            // String word=sub.get(i);

            if((word.length()!=0)&&
                    (word.charAt(0)=='a' || word.charAt(0)=='e' || word.charAt(0)=='i'|| word.charAt(0)=='o' || word.charAt(0)=='u')
                    &&
                    !(word.charAt(word.length()-1)=='a' || word.charAt(word.length()-1)=='e' || word.charAt(word.length()-1)=='i'
                            || word.charAt(word.length()-1)=='o' || word.charAt(word.length()-1)=='u')){
                ans.add(word);
            }
        }
        return ans;

    }
    public static void main(String[] args) {
        System.out.println(allPossibleSubsequences("abc"));
    }
}
