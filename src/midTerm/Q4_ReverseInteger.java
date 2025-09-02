package midTerm;
/*
 * Q:-4 MEDIUM Reverse Integer.
Given a signed 32-bit integer x, return x with its digits reversed. If reversing x causes the value to go outside the signed 32-bit integer range [-231, 231 - 1], then return 0.
Assume the environment does not allow you to store 64-bit integers (signed or unsigned).

Example 1:
Input: x = 123
Output: 321
Example 2:
Input: x = -123
Output: -321
Example 3:
Input: x = 120
Output: 21
Constraints:
-231 <= x <= 231 – 1

 */
public class Q4_ReverseInteger {
    public static void reverseInt(int n){
        int num=Math.abs(n);
        int sum=0;
        while(num>0){
            int digit=num%10;
            sum=(sum*10)+digit;
            num/=10;
        }
        if(n<0){
            sum=0-sum;
        }
        System.out.println(sum);
    }
    public static void main(String[] args) {
        reverseInt(235);
        reverseInt(-123);
    }
}
