package LeetCode;

/**
 * @Author °×ÔÆºÆ
 * @Date 2024/8/12 9:59
 * @×¢ÊÍ
 */

public class T_91 {

    public static void main(String[] args) {

        numDecodings("12");
    }

    public static int numDecodings(String s) {
        int n = s.length();
        int[] dp = new int[n + 1];
        dp[0] = 1;
        for (int i = 1; i <= n; i++) {
            if (s.charAt(i - 1) != '0') {
                dp[i] += dp[i - 1];
            }
            if (i > 1 && s.charAt(i - 2) != '0' && ((s.charAt(i - 2) - '0') * 10 + (s.charAt(i - 1) - '0') <= 26)) {
                dp[i] += dp[i - 2];

            }
        }
        return dp[n];
    }
}
