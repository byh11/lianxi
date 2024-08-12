package LeetCode;

/**
 * @Author °×ÔÆºÆ
 * @Date 2024/8/12 11:58
 * @×¢ÊÍ
 */

public class T_73 {

    public static void main(String[] args) {

        setZeroes(new int[][]{{1, 1, 1}, {1, 0, 1}, {1, 1, 1}});
    }

    public static void setZeroes(int[][] matrix) {
        int n = matrix.length;
        int m = matrix[0].length;
        int[][] x = new int[n][m];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                x[i][j] = matrix[i][j];
            }
        }
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (check(x, i, j)) {
                    matrix[i][j] = 0;
                }
            }
        }
    }

    public static boolean check(int[][] matrix, int i, int j) {
        for (int k = 0; k < matrix.length; k++) {
            if (matrix[k][j] == 0) {
                return true;
            }
        }
        for (int k = 0; k < matrix[0].length; k++) {
            if (matrix[i][k] == 0) {
                return true;
            }
        }
        return false;
    }
}
