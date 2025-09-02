package midTerm;
/*
Q:-26 MEDIUM First Unique Character in a String.
Given a string s, find the first non-repeating character in it and return its index. If it does not exist, return -1.
Example 1:
Input: s = "leetcode"
Output: 0
Explanation:
The character 'l' at index 0 is the first character that does not occur at any other index.

Example 2:
Input: s = "loveleetcode"
Output: 2

Example 3:
Input: s = "aabb"
Output: -1
Constraints:
1 <= s.length <= 105
s consists of only lowercase English letters.

 */
public class Q26_FirstUnique {
    public static int firstChar(String s){
        int count[]=new int[256];
        for(int i=0;i<s.length();i++){
            int idx=(int)s.charAt(i);
            count[idx]++;
        }
        for(int i=0;i<s.length();i++){
            int idx=(int) s.charAt(i);
            if(count[idx]==1){
                return s.indexOf(String.valueOf((char)idx));
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        String s="loveleetcode";
        System.out.println(firstChar(s));
    }
}
