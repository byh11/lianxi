package LeetCode;

/**
 * @Author ���ƺ�
 * @Date 2024/8/1 22:04
 * @ע��
 */

public class M_17_16 {

    public static void main(String[] args) {


    }

    public static int massage(int[] nums) {
        int n = nums.length;
        if (n == 0) {
            return 0;
        }
        int dp0 = 0, dp1 = nums[0];

        for (int i = 1; i < n; ++i){
            int tdp0 = Math.max(dp0, dp1); // ���� dp[i][0]
            int tdp1 = dp0 + nums[i]; // ���� dp[i][1]

            dp0 = tdp0; // �� dp[i][0] ���� dp_0
            dp1 = tdp1; // �� dp[i][1] ���� dp_1
        }
        return Math.max(dp0, dp1);
    }
}
