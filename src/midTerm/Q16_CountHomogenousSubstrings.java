package midTerm;

/*
Q:-16 HARD Count Number of Homogenous Substrings.
Given a string s, return the number of homogenous substrings of s. Since the answer may be too large, return it modulo 10^9 + 7.
A string is homogenous if all the characters of the string are the same.
A substring is a contiguous sequence of characters within a string.
Example 1:
Input: s = "abbcccaa"
Output: 13
Explanation: The homogenous substrings are listed as below:
"a"   appears 3 times.
"aa"  appears 1 time.
"b"   appears 2 times.
"bb"  appears 1 time.
"c"   appears 3 times.
"cc"  appears 2 times.
"ccc" appears 1 time.
3 + 1 + 2 + 1 + 3 + 2 + 1 = 13.
Example 2:
Input: s = "xy"
Output: 2
Explanation: The homogenous substrings are "x" and "y".
Example 3:
Input: s = "zzzzz"
Output: 15
Constraints:
1 <= s.length <= 105
s consists of lowercase letters.

 */
public class Q16_CountHomogenousSubstrings {
    public static int countHomoSubstring(String st){
        long count=1,sum=0,mod=1000000009;
        for(int i=0;i<st.length()-1;i++){
            if(st.charAt(i)==st.charAt(i+1)){
                count++;
            }else{
                sum+=((count*(count+1))/2)%mod;
                count=1;
            }
        }
        sum+=((count*(count+1))/2)%mod;
        return (int)sum;
    }
    public static void main(String[] args) {
        String st="abbcccaa";
        System.out.println(countHomoSubstring(st));
    }
}
