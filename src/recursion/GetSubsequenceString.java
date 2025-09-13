package recursion;

import java.util.ArrayList;
import java.util.List;

public class GetSubsequenceString {
    public static List<String> allSub(String str){
        if(str.length()==0){
            List<String> phaiList=new ArrayList<>();
            phaiList.add("");
            return phaiList;
        }
        char first=str.charAt(0);
        String remaining=str.substring(1);

        List<String> subWithOutFirst= allSub(remaining);

        List<String> ans=new ArrayList<>();
        for(String s:subWithOutFirst){
            ans.add(""+s);
            ans.add(first+s);
        }

        return ans;
    }
    public static int numMatchingSubseq(String s, String[] words) {
        List<String> ans=allSub(s);
        int count=0;
        System.out.print(ans);
        for(String word:words){
            if(ans.contains(word)) count++;
        }
        return count;
    }
    public static void main(String[] args) {
//        System.out.println(allSub("abc"));
        String words[]={"a","bb","acd","ace"};
        String s = "abcde";
        System.out.println(numMatchingSubseq(s,words));
    }

}
