package LeetCode;

public class T_72 {
    public static void main(String[] args) {


    }

    public static int minDistance(String word1, String word2) {
        int[][] dp=new int[word1.length()+1][word2.length()+1];
        for (int i = 0; i < dp.length+1; i++) {
            dp[i][0]=i;
        }
        for (int i = 0; i < dp[0].length+1; i++) {
            dp[0][i]=i;
        }
        for (int i = 1; i < dp.length; i++) {
            for (int j = 0; j < dp[0].length; j++) {
                int left = dp[i - 1][j] + 1;
                int down = dp[i][j - 1] + 1;
                int left_down = dp[i - 1][j - 1];
                if (word1.charAt(i - 1) != word2.charAt(j - 1)) {
                    left_down += 1;
                }
                dp[i][j] = Math.min(left, Math.min(down, left_down));
            }
        }
        return dp[dp.length-1][dp[0].length-1];
    }

}
