package LeetCode;

public class M_01_07 {

    public static void main(String[] args) {
        rotate(new int[][]{{1,2,3},{4,5,6},{7,8,9}});
    }

    public static void rotate(int[][] matrix) {
        int[][] newMatrix = new int[matrix.length][matrix[0].length];
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                newMatrix[i][j] = matrix[matrix.length - 1 - j][i];
            }
        }

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.println(newMatrix[i][j]);
                matrix[i][j] = newMatrix[i][j];
            }
        }

    }
}
