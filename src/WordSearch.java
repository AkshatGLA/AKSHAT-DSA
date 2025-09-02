//import java.io.*;
//import java.util.*;
//
///**
// * NOTE: Class Name should be Main
// */
//public class Main {
//
//    // Static variables to be accessed from static methods
//    private static int rows;
//    private static int cols;
//    private static Set<String> visited;
//
//    public static void main(String[] args) throws InterruptedException {
//        List<String> inputByLine = new ArrayList<String>();
//        try {
//            // Get the object of DataInputStream
//            InputStreamReader isr = new InputStreamReader(System.in, "UTF-8");
//            BufferedReader br = new BufferedReader(isr);
//            String line = "";
//
//            // Read all lines from input and store them in a list
//            while ((line = br.readLine()) != null) {
//                inputByLine.add(line.toString());
//            }
//
//            // Parse the input from the list
//            int m = Integer.parseInt(inputByLine.get(0));
//            rows = m;
//            int n = Integer.parseInt(inputByLine.get(1));
//            cols = n;
//
//            char[][] board = new char[m][n];
//            // The board rows start from the 3rd line (index 2) of the input
//            for (int i = 0; i < m; i++) {
//                String boardRow = inputByLine.get(i + 2);
//                for (int j = 0; j < n; j++) {
//                    board[i][j] = boardRow.charAt(j);
//                }
//            }
//
//            // The word is the last line of the input
//            String word = inputByLine.get(m + 2);
//
//            // Call the solver function and print the result
//            boolean result = exist(board, word);
//            System.out.println(result);
//
//            isr.close();
//
//        } catch (IOException ioe) {
//            ioe.printStackTrace();
//        }
//    }
//
//    /**
//     * This static function initializes the search.
//     */
//    public static boolean exist(char[][] board, String word) {
//        visited = new HashSet<>();
//        Map<Character, Integer> count = new HashMap<>();
//        for (char c : word.toCharArray()) {
//            count.put(c, count.getOrDefault(c, 0) + 1);
//        }
//
//        if (count.getOrDefault(word.charAt(0), 0) > count.getOrDefault(word.charAt(word.length() - 1), 0)) {
//            word = new StringBuilder(word).reverse().toString();
//        }
//
//        for (int r = 0; r < rows; r++) {
//            for (int c = 0; c < cols; c++) {
//                if (dfs(board, word, r, c, 0)) {
//                    return true;
//                }
//            }
//        }
//        return false;
//    }
//
//    /**
//     * A recursive Depth-First Search (DFS) function with backtracking.
//     */
//    private static boolean dfs(char[][] board, String word, int r, int c, int k) {
//        if (k == word.length()) {
//            return true;
//        }
//
//        String pos = r + "," + c;
//        if (r < 0 || r >= rows || c < 0 || c >= cols || visited.contains(pos) || board[r][c] != word.charAt(k)) {
//            return false;
//        }
//
//        visited.add(pos);
//        boolean res = dfs(board, word, r + 1, c, k + 1) ||
//                dfs(board, word, r - 1, c, k + 1) ||
//                dfs(board, word, r, c + 1, k + 1) ||
//                dfs(board, word, r, c - 1, k + 1);
//        visited.remove(pos); // Backtrack
//
//        return res;
//    }
//}