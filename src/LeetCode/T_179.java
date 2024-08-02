package LeetCode;

import java.util.Arrays;

/**
 * @Author °×ÔÆºÆ
 * @Date 2024/8/2 15:51
 * @×¢ÊÍ
 */

public class T_179 {

    public static void main(String[] args) {
        largestNumber(new int[]{0, 0});
    }

    public static String largestNumber(int[] nums) {
        String[] strings = new String[nums.length];
        for (int i = 0; i < nums.length; i++) {
            strings[i] = String.valueOf(nums[i]);
        }
        Arrays.sort(strings, (x, y) -> (y + x).compareTo(x + y));
        String a = "";
        for (int i = 0; i < strings.length; i++) {
            if (i != 0 && "0".equals(strings[i]) && a.equals("0")) {
                continue;
            }
            a += strings[i];
        }
        return a;
    }
}
