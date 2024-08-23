package LeetCode;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author °×ÔÆºÆ
 * @Date 2024/8/15 21:50
 * @×¢ÊÍ
 */

public class T_3148 {

    public static void main(String[] args) {

        List<List<Integer>> l = new ArrayList<>();
        List<Integer> list = new ArrayList<>();
        list.add(4);
        list.add(3);
        list.add(2);
        l.add(list);
        list = new ArrayList<>();
        list.add(3);
        list.add(2);
        list.add(1);
        l.add(list);
        maxScore(l);
    }

    public static int maxScore(List<List<Integer>> grid) {
        int n = grid.size();
        int m = grid.get(0).size();
        int[][] dp = new int[n][m];
        int max = Integer.MIN_VALUE;
        int min = Integer.MIN_VALUE;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                for (int k = j + 1; k < m; k++) {
                    if (grid.get(i).get(j) < grid.get(i).get(k)) {
                        dp[i][k] = Math.max((grid.get(i).get(k) - grid.get(i).get(j) + dp[i][j]), dp[i][k]);
                        max = Math.max(max, dp[i][k]);
                    } else {
                        min = Math.max(min, (grid.get(i).get(k) - grid.get(i).get(j)));
                    }
                }
                for (int k = i + 1; k < n; k++) {
                    if (grid.get(i).get(j) < grid.get(k).get(j)) {
                        dp[k][j] = Math.max((grid.get(k).get(j) - grid.get(i).get(j) + dp[i][j]), dp[k][j]);
                        max = Math.max(max, dp[k][j]);
                    } else {
                        min = Math.max(min, (grid.get(k).get(j) - grid.get(i).get(j)));
                    }
                }
            }
        }
        return max == Integer.MIN_VALUE ? min : max;
    }
}
