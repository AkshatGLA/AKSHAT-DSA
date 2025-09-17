package backtracking;

public class NQueensCount {
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
    public static int nqueen(int chess[][],int row){
        if(chess.length==row) return 1;
        int count=0;
        for(int col=0;col<chess.length;col++){
            if(safePlace(chess,row,col)){
                chess[row][col]=1;
                count+=nqueen(chess,row+1);
                chess[row][col]=0;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        int n=4;
        int chess[][]=new int[n][n];
        System.out.println(nqueen(chess,0));


    }
}
