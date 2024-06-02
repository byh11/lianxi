package LeetCode;

import java.util.ArrayList;
import java.util.Arrays;

public class T_377 {

    public static void main(String[] args) {

        combinationSum4(new int[]{1,2,3},5);
    }

    public static int combinationSum4(int[] nums, int target) {
        int[] dp=new int[target+1];
        dp[0]=1;
        for (int i = 1; i <= target; i++) {
            for (int num : nums) {
                if (num <= i) {
                    dp[i] += dp[i - num];
                }
            }
        }
        return dp[target];
    }


}
