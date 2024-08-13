package LeetCode;

/**
 * @Author °×ÔÆºÆ
 * @Date 2024/8/9 14:42
 * @×¢ÊÍ
 */

public class T_79 {

    public static void main(String[] args) {
        exist(new char[][]{{'C', 'A', 'A'}, {'A', 'A', 'A'}, {'B', 'C', 'D'}}, "AAB");
    }

    public static boolean exist(char[][] board, String word) {
        boolean[][] booleans = new boolean[board.length][board[0].length];
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[0].length; j++) {
                if (check(booleans, board, word, 0, i, j)) {
                    return true;
                }
            }
        }
        return false;
    }

    public static boolean check(boolean[][] booleans, char[][] board, String word, int index, int i, int j) {
        booleans[i][j] = true;
        if (index == word.length()) {
            return true;
        }
        if (board[i][j] != word.charAt(index)) {
            booleans[i][j] = false;
            return false;
        }
        if (i > 0) {
            if (!booleans[i - 1][j]) {
                boolean b = check(booleans, board, word, index + 1, i - 1, j);
                if (b) {
                    return true;
                }
            }
        }
        if (i < board.length - 1) {
            if (!booleans[i + 1][j]) {
                boolean b = check(booleans, board, word, index + 1, i + 1, j);
                if (b) {
                    return true;
                }
            }
        }
        if (j > 0) {
            if (!booleans[i][j - 1]) {
                boolean b = check(booleans, board, word, index + 1, i, j - 1);
                if (b) {
                    return true;
                }
            }
        }
        if (j < board[0].length - 1) {
            if (!booleans[i][j + 1]) {
                boolean b = check(booleans, board, word, index + 1, i, j + 1);
                if (b) {
                    return true;
                }
            }
        }
        if (index + 1 == word.length()) {
            return booleans[i][j];
        }
        booleans[i][j] = false;
        return false;
    }
}
