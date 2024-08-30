package LeetCode;

/**
 * @Author 白云浩
 * @Date 2024/8/30 23:05
 * @注释
 */

public class T_3142 {

    public static void main(String[] args) {

    }

    public static boolean satisfiesConditions(int[][] grid) {
        for (int i = 0; i < grid.length; i++) {
            if (i == grid.length - 1) {
                for (int j = 0; j < grid[i].length - 1; j++) {
                    if (grid[i][j] == grid[i][j + 1]) {
                        return false;
                    }
                }
            } else {
                for (int j = 0; j < grid[i].length; j++) {
                    if (grid[i][j] != grid[i + 1][j]) {
                        return false;
                    }
                }
            }
        }
        return true;
    }
}
