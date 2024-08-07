package LeetCode;

import java.util.Arrays;

/**
 * @Author °×ÔÆºÆ
 * @Date 2024/8/6 16:12
 * @×¢ÊÍ
 */

public class T_378 {

    public static void main(String[] args) {


    }

    public static int kthSmallest(int[][] matrix, int k) {
        int n = matrix.length;
        int[] num = new int[n * n];
        int a = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                num[a++] = matrix[i][j];
            }
        }
        Arrays.sort(num);
        return num[num.length - k - 1];
    }
}
