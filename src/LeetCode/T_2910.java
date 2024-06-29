package LeetCode;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class T_2910 {

    public static void main(String[] args) {

        minGroupsForValidAssignment(new int[]{1,1,1,3,3,3,1,2,1,1,1,2,1});
    }

    public static int minGroupsForValidAssignment(int[] balls) {
        Map<Integer, Integer> cnt = new HashMap<>();
        for (int x : balls) {
            cnt.merge(x, 1, Integer::sum);
        }
        int k = balls.length;
        for (int c : cnt.values()) {
            k = Math.min(k, c);
        }
        for (; ; k--) {
            int ans = 0;
            for (int c : cnt.values()) {
                if (c / k < c % k) {
                    ans = 0;
                    break;
                }
                ans += (c + k) / (k + 1);
            }
            if (ans > 0) {
                return ans;
            }
        }
    }
}
