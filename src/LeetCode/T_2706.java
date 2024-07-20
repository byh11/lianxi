package LeetCode;

import java.util.Arrays;

/**
 * @Author °×ÔÆºÆ
 * @Date 2024/7/20 23:09
 * @×¢ÊÍ
 */

public class T_2706 {

    public static void main(String[] args) {


    }

    public static int buyChoco(int[] prices, int money) {
        Arrays.sort(prices);
        return money-prices[0]-prices[1]>=0 ?money-prices[0]-prices[1]:money;
    }
}
