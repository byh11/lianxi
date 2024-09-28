package LeetCode;

import java.util.Arrays;

/**
 * @Author 白云浩
 * @Date 2024/9/19 9:01
 * @注释
 */

public class T_1984 {

    public static void main(String[] args) {

        minimumDifference(new int[]{9, 4, 1, 7}, 2);
    }

    public static int minimumDifference(int[] nums, int k) {
        if (k == 0) {
            return 0;
        }
        Arrays.sort(nums);
        int min = Integer.MAX_VALUE;
        for (int i = 0; i < nums.length - k + 1; i++) {
            if (min > nums[i + k - 1] - nums[i]) {
                min = nums[i + k - 1] - nums[i];
            }
        }
        return min;
    }

}
