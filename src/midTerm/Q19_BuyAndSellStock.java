package midTerm;

import java.util.Arrays;

/*
Q:-19 MEDIUM Best Time to Buy and Sell Stock.
You are given an array prices where prices[i] is the price of a given stock on the ith day.
You want to maximize your profit by choosing a single day to buy one stock and choosing a different day in the future to sell that stock.

Return the maximum profit you can achieve from this transaction. If you cannot achieve any profit, return 0.
Example 1:
Input: prices = [7,1,5,3,6,4]
Output: 5
Explanation: Buy on day 2 (price = 1) and sell on day 5 (price = 6), profit = 6-1 = 5.
Note that buying on day 2 and selling on day 1 is not allowed because you must buy before you sell.
Example 2:
Input: prices = [7,6,4,3,1]
Output: 0
Explanation: In this case, no transactions are done and the max profit = 0.
Constraints:
1 <= prices.length <= 105
0 <= prices[i] <= 104

 */
public class Q19_BuyAndSellStock {
    public static int buyAndSell(int arr[]){
        int n=arr.length-1;
        int max_arr[]=new int[n+1];
        int profit=0;
        max_arr[n]=arr[n];
        for(int i=n-1;i>=0;i--){
            max_arr[i]=Math.max(arr[i],max_arr[i+1]);
        }
        for(int i=0;i<n;i++){
            profit=Math.max(profit,max_arr[i]-arr[i]);
        }
        return profit;
    }
//    Optimised code
    public static int buyAndSellOpt(int arr[]){
        int min=Integer.MAX_VALUE;
        int profit=0;
        for(int i=0;i<arr.length;i++){
            min=Math.min(min,arr[i]);
            profit=Math.max(profit,arr[i]-min);
        }
        return profit;
    }
    public static void main(String[] args) {
        int arr[]={7,1,5,3,6,4};
        int arr2[]={7,6,4,3,1};
        System.out.println(buyAndSell(arr));
        System.out.println(buyAndSell(arr2));
        System.out.println(buyAndSellOpt(arr));
        System.out.println(buyAndSellOpt(arr2));
    }
}
