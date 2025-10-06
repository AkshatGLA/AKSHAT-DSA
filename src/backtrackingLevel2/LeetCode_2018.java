package backtrackingLevel2;

public class LeetCode_2018 {

    public boolean placeWordInCrossword(char[][] board, String word) {
        String rev = new StringBuilder(word).reverse().toString();

        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[0].length; j++) {
                // try normal word
                if ((board[i][j] == ' ' || board[i][j] == word.charAt(0))) {
                    if (canPlaceWordHorizontally(board, word, i, j) ||
                            canPlaceWordVertically(board, word, i, j))
                        return true;
                }

                // try reversed word
                if ((board[i][j] == ' ' || board[i][j] == rev.charAt(0))) {
                    if (canPlaceWordHorizontally(board, rev, i, j) ||
                            canPlaceWordVertically(board, rev, i, j))
                        return true;
                }
            }
        }
        return false;
    }

    // ================= Vertical =================
    public static boolean canPlaceWordVertically(char[][] board, String word, int i, int j) {
        if (i + word.length() > board.length) return false;
        if (i > 0 && board[i - 1][j] != '#') return false;
        if (i + word.length() < board.length && board[i + word.length()][j] != '#') return false;

        for (int k = 0; k < word.length(); k++) {
            char ch = board[i + k][j];
            if (ch != ' ' && ch != word.charAt(k)) return false;
        }
        return true;
    }

    // ================= Horizontal =================
    public static boolean canPlaceWordHorizontally(char[][] board, String word, int i, int j) {
        if (j + word.length() > board[0].length) return false;
        if (j > 0 && board[i][j - 1] != '#') return false;
        if (j + word.length() < board[0].length && board[i][j + word.length()] != '#') return false;

        for (int k = 0; k < word.length(); k++) {
            char ch = board[i][j + k];
            if (ch != ' ' && ch != word.charAt(k)) return false;
        }
        return true;
    }

    // ================= Main =================
    public static void main(String[] args) {
        char[][] board = {
                {'#', ' ', '#'},
                {' ', ' ', '#'},
                {'#', 'c', ' '}
        };
        String word = "abc";

        String rev = new StringBuilder(word).reverse().toString();

    }
}
