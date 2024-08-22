package LeetCode;

import java.util.Arrays;

/**
 * @Author °×ÔÆºÆ
 * @Date 2024/8/9 14:32
 * @×¢ÊÍ
 */

public class T_3131 {

    public static void main(String[] args) {


    }

    public static int addedInteger(int[] nums1, int[] nums2) {
        int a = Arrays.stream(nums1).sum();
        int b = Arrays.stream(nums2).sum();
        return (b - a) / nums1.length;
    }
}
