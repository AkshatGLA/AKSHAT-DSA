package backtracking;

import java.util.ArrayList;
import java.util.List;

public class NQueens {
    public static void main(String[] args) {
        int n=4 ;
        int board[][]=new int[n][n];
        List<List<String>> result=new ArrayList<>();
        nqueen(board,"",0,result);
        System.out.println(result);
    }
    public static List<String> constructBoard(int chess[][]){
        List<String> ans=new ArrayList<>();
        for(int i=0;i<chess.length;i++){
            String str="";
            for(int j=0;j<chess.length;j++){
                if(chess[i][j]==1){
                    str+="Q";
                }else str+='.';
            }
            ans.add(str);
        }
        return ans;
    }

    public static void nqueen(int chess[][], String qsf, int row, List<List<String>> result) {

        if(chess.length==row){
//            System.out.println(qsf);
            result.add(constructBoard(chess));
            return;
        }
        for(int col=0;col<chess.length;col++){
            if(safePlace(chess,row,col)){
                chess[row][col]=1;
                nqueen(chess,qsf+row+"-"+col+",",row+1,result);
                chess[row][col]=0;
            }
        }
    }
    public static boolean safePlace(int chess[][],int row,int col){
        for(int i=row-1,j=col;i>=0;i--){
            if(chess[i][j]==1) return false;
        }
        for(int i=row-1,j=col-1;i>=0 && j>=0; i--,j--){
            if(chess[i][j]==1) return false;
        }
        for(int i=row-1,j=col+1;i>=0 && j<chess.length;i--,j++){
            if(chess[i][j]==1) return false;
        }
        return true;
    }
}
