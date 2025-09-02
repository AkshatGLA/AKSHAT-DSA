package midTerm;

import java.util.Arrays;

/*
Q:-15 HARD Longest Common Prefix

Write a function to find the longest common prefix string amongst an array of strings.
If there is no common prefix, return an empty string "".
Example 1:
Input: strs = ["flower","flow","flight"]
Output: "fl"
Example 2:
Input: strs = ["dog","racecar","car"]
Output: ""
Explanation: There is no common prefix among the input strings.
Constraints:
1 <= strs.length <= 200
0 <= strs[i].length <= 200
strs[i] consists of only lowercase English letters if it is non-empty.


 */
public class Q15_LongestCommonPrefix {
    public static String commonPrefix(String[] str){
        Arrays.sort(str);
        String s1=str[0];
        String s2=str[str.length-1];
        StringBuilder ans=new StringBuilder();
        for(int i=0;i<Math.min(s1.length(),s2.length());i++){
            if(s1.charAt(i)!=s2.charAt(i)){
                return ans.toString();
            }
            ans.append(s1.charAt(i));
        }
        return ans.toString();
    }
    public static void main(String[] args) {
        String[] str={"flower","flow","flight"};
        System.out.println(commonPrefix(str));
    }
}
