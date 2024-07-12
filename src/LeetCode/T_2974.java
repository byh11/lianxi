package LeetCode;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * @Author °×ÔÆºÆ
 * @Date 2024/7/12 22:30
 * @×¢ÊÍ
 */

public class T_2974 {

    public static void main(String[] args) {


    }

    public static int[] numberGame(int[] nums) {
        Arrays.sort(nums);
        int[] n=new int[nums.length];
        for (int i = 0; i <nums.length ; i+=2) {
            n[i]=nums[i+1];
            n[i+1]=nums[i];
        }
        return n;
    }
}
