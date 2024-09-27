package LeetCode;

import java.util.Arrays;

/**
 * @Author 白云浩
 * @Date 2024/9/19 9:32
 * @注释
 */

public class T_1921 {

    public static void main(String[] args) {


    }

    public int eliminateMaximum(int[] dist, int[] speed) {
        int n = dist.length;
        int[] arrivalTimes = new int[n];
        for (int i = 0; i < n; i++) {
            arrivalTimes[i] = (dist[i] - 1) / speed[i] + 1;
        }
        Arrays.sort(arrivalTimes);
        for (int i = 0; i < n; i++) {
            if (arrivalTimes[i] <= i) {
                return i;
            }
        }
        return n;
    }
}
