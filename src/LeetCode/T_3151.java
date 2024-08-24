package LeetCode;

/**
 * @Author °×ÔÆºÆ
 * @Date 2024/8/15 21:26
 * @×¢ÊÍ
 */

public class T_3151 {

    public static void main(String[] args) {


    }

    public static boolean isArraySpecial(int[] nums) {
        for (int i = 1; i < nums.length; i++) {
            if ((nums[i - 1] % 2 == 0 && nums[i] % 2 == 0) || (nums[i - 1] % 2 != 0 && nums[i] % 2 != 0)) {
                return false;
            }
        }
        return true;
    }
}
