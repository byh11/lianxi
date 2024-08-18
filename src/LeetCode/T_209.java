package LeetCode;

/**
 * @Author °×ÔÆºÆ
 * @Date 2024/8/14 15:11
 * @×¢ÊÍ
 */
public class T_209 {

    public static void main(String[] args) {

        minSubArrayLen(11, new int[]{1, 2, 3, 4, 5});
    }

    public static int minSubArrayLen(int target, int[] nums) {
        int n = nums.length;
        int l = 0, r = 0;
        int min = Integer.MAX_VALUE;
        int sum = 0;
        while (r < n) {
            sum += nums[r];
            while (sum >= target) {
                min = Math.min(min, r - l + 1);
                sum -= nums[l];
                l++;
            }
            r++;
        }
        return min == Integer.MAX_VALUE ? 0 : min;
    }
}
