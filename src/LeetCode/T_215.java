package LeetCode;

import java.util.Arrays;

/**
 * @Author °×ÔÆºÆ
 * @Date 2024/7/26 15:40
 * @×¢ÊÍ
 */

public class T_215 {

    public static void main(String[] args) {


    }

    public static int findKthLargest(int[] nums, int k) {
        Arrays.sort(nums);
        return nums[nums.length-k];
    }
}
