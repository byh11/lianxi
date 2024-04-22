package LeetCode;

import java.util.Arrays;

public class T_169 {
    public static void main(String[] args) {


    }

    public static int majorityElement(int[] nums) {
        Arrays.sort(nums);
        return nums[nums.length/2];
    }
}
