package midTerm;
/*
Q:-17 MEDIUM Climbing Stairs.
You are climbing a staircase. It takes n steps to reach the top.
Each time you can either climb 1 or 2 steps. In how many distinct ways can you climb to the top?
Example 1:
Input: n = 2
Output: 2
Explanation: There are two ways to climb to the top.
1. 1 step + 1 step
2. 2 steps
Example 2:
Input: n = 3
Output: 3
Explanation: There are three ways to climb to the top.
1. 1 step + 1 step + 1 step
2. 1 step + 2 steps
3. 2 steps + 1 step
Constraints:
1 <= n <= 45



 */
public class Q17_ClimbingStairs {
    public static int climbStairs(int n){
        if(n<=1) return n;
        int x=0,y=1,z=0;
        for(int i=0;i<n;i++){
            z=x+y;
            x=y;
            y=z;
        }
        return y;
    }

    public static void main(String[] args) {
        System.out.println(climbStairs(3));
    }
}
