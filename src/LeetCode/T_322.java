package LeetCode;

import java.util.Arrays;
import java.util.stream.IntStream;

public class T_322 {

    public static void main(String[] args) {
        System.out.println(coinChange(new int[]{186,419,83,408}, 6249));
    }

    public static int coinChange(int[] coins, int amount) {
        if(coins.length == 0){
            return -1;
        }
        int[] memo = new int[amount+1];
        memo[0] = 0;
        for(int i = 1; i <= amount;i++){
            int min = Integer.MAX_VALUE;
            for(int j = 0;j < coins.length;j++){
                if(i - coins[j] >= 0 && memo[i-coins[j]] < min){
                    min = memo[i-coins[j]] + 1;
                }
            }
            memo[i] = min;
        }
        return memo[amount] == Integer.MAX_VALUE ? -1 : memo[amount];
    }
}
