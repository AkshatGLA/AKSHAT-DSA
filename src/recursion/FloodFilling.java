package recursion;

import java.util.Scanner;

public class FloodFilling {
    public static void floodFill(int maze[][], int row, int col, String psf, boolean visited[][]) {
        if (row < 0 || col < 0 || row == maze.length || col == maze[0].length
                || maze[row][col] == 1 || visited[row][col]) {
            return;
        }

        if (row == maze.length - 1 && col == maze[0].length - 1) {
            System.out.println(psf);
            return;
        }

        visited[row][col] = true;

        floodFill(maze, row - 1, col, psf + "t", visited);
        floodFill(maze, row, col - 1, psf + "l", visited);
        floodFill(maze, row + 1, col, psf + "d", visited);
        floodFill(maze, row, col + 1, psf + "r", visited);

        visited[row][col] = false;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter rows: ");
        int row = sc.nextInt();
        System.out.print("Enter columns: ");
        int col = sc.nextInt();

        int maze[][] = new int[row][col];
        System.out.println("Enter maze matrix (0 for open, 1 for blocked):");
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                maze[i][j] = sc.nextInt();
            }
        }

        boolean visited[][] = new boolean[row][col];

        floodFill(maze, 0, 0, "", visited);
    }
}
