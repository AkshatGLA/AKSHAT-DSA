package backtracking;

public class RatInMaze {
    public static int totalPaths(int sr,int sc,int er,int ec){
        if(sr>er || sc>ec) return 0;
        if(sr==er && sc==ec) return 1;
        int total_ways=totalPaths(sr+1,sc,er,ec) + totalPaths(sr,sc+1,er,ec);
        return total_ways;
    }
    public static int uniquePaths(int m, int n) {
        return totalPaths(1,1,m,n);
    }

    public static void main(String[] args) {
        System.out.println(uniquePaths(50,50));
    }
}
