package midTerm;

import java.io.PrintStream;
import java.util.ArrayList;
import java.util.List;

/*
Q:-18 HARD Pascal's Triangle.
Given an integer numRows, return the first numRows of Pascal's triangle.
In Pascal's triangle, each number is the sum of the two numbers directly above it as shown:

Example 1:
Input: numRows = 5
Output: [[1],[1,1],[1,2,1],[1,3,3,1],[1,4,6,4,1]]
Example 2:
Input: numRows = 1
Output: [[1]]
Constraints:
1 <= numRows <= 30

 */
public class Q18_PascalTriangle {
    public static List<List<Integer>> pascalTriangle(int n){
        List<List<Integer>> ans =new ArrayList<>();
        for(int i=0;i<n;i++){
            List<Integer> row=new ArrayList<>();
            row.add(1);
            for(int j=1;j<i;j++){
                int sum=ans.get(i-1).get(j-1)+ans.get(i-1).get(j);
                row.add(sum);
            }
            if(i>0){
                row.add(1);
            }
            ans.add(row);
        }
        return ans;
    }

    public static void main(String[] args) {
        System.out.println(pascalTriangle(1));
    }
}
