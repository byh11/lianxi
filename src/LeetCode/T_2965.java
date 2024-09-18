package LeetCode;


import java.util.HashMap;

/**
 * @Author 白云浩
 * @Date 2024/9/11 15:21
 * @注释
 */

public class T_2965 {

    public static void main(String[] args) {

        findMissingAndRepeatedValues(new int[][]{{1, 3}, {2, 2}});
    }

    public static int[] findMissingAndRepeatedValues(int[][] grid) {
        int n = grid.length * grid[0].length;
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[i].length; j++) {
                if (map.containsKey(grid[i][j])) {
                    map.put(grid[i][j], map.get(grid[i][j]) + 1);
                } else {
                    map.put(grid[i][j], 1);
                }
            }
        }
        int[] a = new int[2];
        for (int i = 1; i <= n; i++) {
            if (map.containsKey(i)) {
                if (map.get(i) > 1) {
                    a[0] = i;
                }
            } else {
                a[1] = i;
            }
        }
        return a;
    }
}
