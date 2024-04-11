package LeetCode;

public class T_343 {

    public static void main(String[] args) {

    }

    public int integerBreak(int n) {
        int[] dp=new int[n];
        dp[2]=1;
        for (int i = 2; i < n; i++) {
            for (int j = 1; j < i; j++) {
                dp[i]=Math.max(dp[i],Math.max(j*(i-j),j*dp[i-j]));
            }
        }
        return dp[n];
    }
}
