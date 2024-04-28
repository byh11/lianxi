package LeetCode;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class T_228 {

    public static void main(String[] args) {


    }

    public static List<String> summaryRanges(int[] nums) {
        if (nums.length == 0) {
            return new ArrayList<>();
        }
        List<String> list = new ArrayList<>();
        String s = "";
        int k = 0;
        int x = nums[0];
        for (int i = 1; i < nums.length; i++) {
            if (x + 1 == nums[i]) {
                x = nums[i];
            } else {
                if (k == i - 1) {
                    s = nums[k] + "";
                } else {
                    s = nums[k] + "->" + nums[i - 1];
                }
                list.add(s);
                s = "";
                k = i;
                x = nums[i];
            }
        }
        if (k == nums.length-1) {
            s = nums[k] + "";
        } else {
            s = nums[k] + "->" + nums[nums.length - 1];
        }
        list.add(s);
        return list;
    }
}
