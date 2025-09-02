package dp;

import java.util.Scanner;

public class Fibonacci {
    public static int nthFib(int n,int dp[]){
        if(n<=1) return n;
        if(dp[n]!=-1) return dp[n];
        return  dp[n]=nthFib(n-1,dp)+nthFib(n-2,dp);
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int dp[]=new int[n+1];
        for(int i=0;i<=n;i++) dp[i]=-1;
        System.out.println(nthFib(n,dp));
    }
}
