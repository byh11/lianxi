package LeetCode;

/**
 * @Author °×ÔÆºÆ
 * @Date 2024/8/6 16:26
 * @×¢ÊÍ
 */

public class T_566 {

    public static void main(String[] args) {

    }

    public static int[][] matrixReshape(int[][] mat, int r, int c) {
        if (r * c != mat.length * mat[0].length) {
            return mat;
        }
        int[][] num = new int[r][c];
        int r1 = 0, c1 = 0;
        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat[i].length; j++) {
                if (c == c1) {
                    r1++;
                    c1 = 0;
                }
                num[r1][c1++] = mat[i][j];
            }
        }
        return num;
    }

}
