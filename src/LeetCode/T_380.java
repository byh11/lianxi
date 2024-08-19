package LeetCode;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Random;

/**
 * @Author 白云浩
 * @Date 2024/8/12 14:14
 * @注释
 */

public class T_380 {

    public static void main(String[] args) {
        RandomizedSet randomizedSet = new RandomizedSet();
        randomizedSet.insert(0); // 向集合中插入 1 。返回 true 表示 1 被成功地插入。
        randomizedSet.insert(1); // 向集合中插入 2 。返回 true 。集合现在包含 [1,2] 。
        randomizedSet.remove(0); // 返回 false ，表示集合中不存在 2 。
//        randomizedSet.getRandom(); // getRandom 应随机返回 1 或 2 。
//        randomizedSet.remove(0);
        randomizedSet.insert(2); // 2 已在集合中，所以返回 false 。
        randomizedSet.remove(1); // 从集合中移除 1 ，返回 true 。集合现在包含 [2] 。
        randomizedSet.getRandom(); // 由于 2 是集合中唯一的数字，getRandom 总是返回 2 。
    }

    static class RandomizedSet {

        HashMap<Integer, Integer> map;
        ArrayList<Integer> list;

        public RandomizedSet() {
            this.map = new HashMap<>();
            this.list = new ArrayList<>();
        }

        public boolean insert(int val) {
            if (map.containsKey(val)) {
                return false;
            } else {
                map.put(val, list.size());
                list.add(val);
                return true;
            }
        }

        public boolean remove(int val) {
            if (!map.containsKey(val)) {
                return false;
            }
            int index = map.get(val);
            int last = list.get(list.size() - 1);
            list.set(index, last);
            map.put(last, index);
            list.remove(list.size() - 1);
            map.remove(val);
            return true;
        }


        public int getRandom() {
            int randomIndex = new Random().nextInt(list.size());
            return list.get(randomIndex);
        }
    }
}
