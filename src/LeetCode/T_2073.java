package LeetCode;

import java.util.Arrays;

public class T_2073 {

    public static void main(String[] args) {

    }

    public int timeRequiredToBuy(int[] tickets, int k) {
        int n=0;
        for (int i = 0; i < tickets.length; i++) {
            if (i <= k) {
                n += Math.min(tickets[i], tickets[k]);
            } else {
                n += Math.min(tickets[i], tickets[k] - 1);
            }
        }
        return n;
    }
}
