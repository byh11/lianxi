package LeetCode;

/**
 * @Author 白云浩
 * @Date 2024/8/31 22:39
 * @注释
 */

public class T_3127 {

    public static void main(String[] args) {


    }

    public static boolean canMakeSquare(char[][] grid) {
        for (int i = 0; i <= 1; i++) {
            for (int j = 0; j <= 1; j++) {
                if (check(grid, i, j)) {
                    return true;
                }
            }
        }
        return false;
    }

    public static boolean check(char[][] grid, int x, int y) {
        int count = 0;
        for (int i = 0; i <= 1; i++) {
            for (int j = 0; j <= 1; j++) {
                if (grid[x + i][y + j] == 'B') {
                    count++;
                }
            }
        }
        return count != 2;
    }

}
