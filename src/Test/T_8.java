package Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

/**
 * @Author 白云浩
 * @Date 2024/9/8 14:10
 * @注释
 */

public class T_8 {

    public static void main(String[] args) {

    }

    public ArrayList<Integer> findIndex(int[] nums, int k) {
        ArrayList<Integer> list = new ArrayList<>();
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            map.put(nums[i], i);
        }
        for (Map.Entry<Integer, Integer> m : map.entrySet()) {
            if (map.containsKey(k - m.getKey())) {
                list.add(m.getValue());
                list.add(map.get(k - m.getKey()));
                return list;
            }
        }
        return null;
    }
}
