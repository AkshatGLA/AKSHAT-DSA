package backtracking;

import java.util.Scanner;

public class PathwithMaximumGold {

    public static int dfs(int[][] grid, boolean[][] visited, int i, int j) {
        // boundary & invalid checks
        if (i < 0 || j < 0 || i >= grid.length || j >= grid[0].length
                || grid[i][j] == 0 || visited[i][j]) {
            return 0;
        }

        // pick current gold
        visited[i][j] = true;
        int goldHere = grid[i][j];

        // explore all 4 directions
        int up = dfs(grid, visited, i - 1, j);
        int down = dfs(grid, visited, i + 1, j);
        int left = dfs(grid, visited, i, j - 1);
        int right = dfs(grid, visited, i, j + 1);

        // backtrack
        visited[i][j] = false;

        // max path from this cell
        return goldHere + Math.max(Math.max(up, down), Math.max(left, right));
    }

    public static int getMaxGold(int[][] grid) {
        boolean[][] visited = new boolean[grid.length][grid[0].length];
        int max = 0;

        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[0].length; j++) {
                if (grid[i][j] != 0) {
                    max = Math.max(max, dfs(grid, visited, i, j));
                }
            }
        }
        return max;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of rows: ");
        int m = sc.nextInt();
        System.out.println("Enter the number of columns: ");
        int n = sc.nextInt();

        int grid[][] = new int[m][n];
        System.out.println("Enter the elements of the grid: ");
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                grid[i][j] = sc.nextInt();
            }
        }

        int max = getMaxGold(grid);
        System.out.println("Maximum Gold: " + max);
    }
}
