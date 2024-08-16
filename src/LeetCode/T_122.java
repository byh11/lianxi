package LeetCode;

/**
 * @Author °×ÔÆºÆ
 * @Date 2024/8/12 11:38
 * @×¢ÊÍ
 */

public class T_122 {

    public static void main(String[] args) {


    }

    public static int maxProfit(int[] prices) {
        int dp1 = 0;
        int dp2 = -prices[0];
        for (int i = 0; i < prices.length; i++) {
            int ndp1 = Math.max(dp1, dp2 + prices[i]);
            int ndp2 = Math.max(dp2, dp1 - prices[i]);
            dp1 = ndp1;
            dp2 = ndp2;
        }
        return dp1;
    }
}
