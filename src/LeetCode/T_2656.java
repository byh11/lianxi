package LeetCode;

import java.util.Arrays;

public class T_2656 {

    public static void main(String[] args) {
        System.out.println(maximizeSum(new int[]{5,3,4,6,3}, 2));
    }

    public static int maximizeSum(int[] nums, int k) {
        nums= Arrays.stream(nums).sorted().toArray();
        int n=0;
        for (int i = 0; i < k; i++) {
            n+=nums[nums.length-1]+i;
        }
        return n;
    }
}
