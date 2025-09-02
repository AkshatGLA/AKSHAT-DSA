package midTerm;
/*
Q:-14.EASSY Valid Anagram.
Given two strings s and t, return true if t is an anagram of s, and false otherwise.
Example 1:
Input: s = "anagram", t = "nagaram"
Output: true
Example 2:
Input: s = "rat", t = "car"
Output: false
Constraints:
1 <= s.length, t.length <= 5 * 104
s and t consist of lowercase English letters.

 */
public class Q14_ValidAnagram {
    public static boolean isAnagram(String s,String t){
        int arr[]=new int[256];
        for(int i=0;i<s.length();i++){
            arr[(int)s.charAt(i)]++;
        }
        for(int i=0;i<t.length();i++){
            arr[(int)t.charAt(i)]--;
        }
        for(int i=0;i<256;i++){
            if(arr[i]>0){
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
         String s = "anagram", t = "nagaram";
        System.out.println(isAnagram(s,t));
        isAnagram(s,t);
        String s1 = "rat", t1 = "car";
        System.out.println(isAnagram(s1,t1));
    }
}
