package LeetCode;

/**
 * @Author °×ÔÆºÆ
 * @Date 2024/7/8 21:38
 * @×¢ÊÍ
 */

public class T_724 {

    public static void main(String[] args) {

    }

    public static int pivotIndex(int[] nums) {
        for (int i = 0; i < nums.length; i++) {
            int left = 0;
            int right = 0;
            for (int j = 0; j < i; j++) {
                left += nums[j];
            }
            for (int j = i + 1; j < nums.length; j++) {
                right += nums[j];
            }
            if (left == right) {
                return i;
            }
        }
        return -1;
    }
}
