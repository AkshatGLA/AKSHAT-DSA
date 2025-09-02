package midTerm;

import java.util.Arrays;

/*
Q:-24EASSY Reverse String
Write a function that reverses a string. The input string is given as an array of characters s.
You must do this by modifying the input array in-place with O(1) extra memory.

Example 1:
Input: s = ["h","e","l","l","o"]
Output: ["o","l","l","e","h"]

Example 2:
Input: s = ["H","a","n","n","a","h"]
Output: ["h","a","n","n","a","H"]

Constraints:
1 <= s.length <= 105
s[i] is a printable ascii character.

 */
public class Q24_ReverseString {
    public static void reverseString(char[] s) {
        int st = 0, end = s.length - 1;
        while (st < end) {
            char temp = s[st];
            s[st] = s[end];
            s[end] = temp;
            st++;
            end--;
        }
    }

    public static void main(String[] args) {
        char s[] = {'a','e','i','o','u'};
        reverseString(s);
        System.out.println(Arrays.toString(s));

    }
}
