package LeetCode;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/**
 * @Author °×ÔÆºÆ
 * @Date 2024/8/6 16:21
 * @×¢ÊÍ
 */

public class T_448 {

    public static void main(String[] args) {


    }

    public static List<Integer> findDisappearedNumbers(int[] nums) {
        ArrayList<Integer> list = new ArrayList<>();
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            map.put(nums[i], nums[i]);
        }
        for (int i = 1; i < nums.length + 1; i++) {
            if (!map.containsKey(i)) {
                list.add(i);
            }
        }
        return list;
    }

}
