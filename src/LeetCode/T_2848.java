package LeetCode;

import java.util.List;

/**
 * @Author 白云浩
 * @Date 2024/9/15 15:37
 * @注释
 */

public class T_2848 {

    public static void main(String[] args) {


    }

    public static int numberOfPoints(List<List<Integer>> nums) {
        int a = 0;
        int max = 0;
        for (int i = 0; i < nums.size(); i++) {
            if (nums.get(i).get(1) > max) {
                max = nums.get(i).get(1);
            }
        }
        boolean[] n = new boolean[max + 1];
        for (int i = 0; i < nums.size(); i++) {
            for (int j = nums.get(i).get(0); j <= nums.get(i).get(1); j++) {
                if (!n[j]) {
                    a++;
                    n[j] = true;
                }
            }
        }
        return a;
    }
}
