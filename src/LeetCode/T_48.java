package LeetCode;

/**
 * @Author °×ÔÆºÆ
 * @Date 2024/7/25 17:46
 * @×¢ÊÍ
 */

public class T_48 {

    public static void main(String[] args) {


    }

    public void rotate(int[][] matrix) {
        for (int i = 0; i < matrix.length / 2; i++) {
            for (int j = 0; j < matrix[i].length/2; j++) {
                int t = matrix[i][j];
                matrix[i][j] = matrix[matrix.length - 1 - j][i];
                matrix[matrix.length - 1 - j][i] = matrix[matrix.length - 1 - i][matrix.length - 1 - j];
                matrix[matrix.length - 1 - i][matrix.length - 1 - j] = matrix[j][matrix.length - 1 - i];
                matrix[j][matrix.length - 1 - i] = t;
            }
        }
    }
}
