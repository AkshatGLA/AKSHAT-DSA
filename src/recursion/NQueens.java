package recursion;

import java.util.Scanner;

public class NQueens {
    public static void printQueens(int [][]chess,String qsf, int row){
        if(row==chess.length){
            System.out.println(qsf);
            return;
        }
        for(int col=0;col<chess.length;col++){
            if(isSafePlace(chess,row,col)==true){
                chess[row][col]=1;
                printQueens(chess,qsf + row + "-" + col + ",",row+1);
                chess[row][col]=0;
            }
        }
    }
    public static boolean isSafePlace(int chess[][], int row,int col){
        for(int i=row-1, j=col;i>=0;i--){
            if(chess[i][j]==1) return false;
        }
        for(int i=row-1,j=col-1;i >= 0 && j >= 0; i--,j--){
            if(chess[i][j]==1) return false;
        }
        for(int i = row-1,j = col+1; i >= 0 && j<chess.length; i--,j++ ){
            if(chess[i][j]==1) return false;
        }
        return true;
    }

    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the size of chess board: ");
        int n=sc.nextInt();
        int chess[][]=new int[n][n];


        printQueens(chess,"",0);
    }
}
