package LeetCode;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Random;

/**
 * @Author ���ƺ�
 * @Date 2024/8/12 14:14
 * @ע��
 */

public class T_380 {

    public static void main(String[] args) {
        RandomizedSet randomizedSet = new RandomizedSet();
        randomizedSet.insert(0); // �򼯺��в��� 1 ������ true ��ʾ 1 ���ɹ��ز��롣
        randomizedSet.insert(1); // �򼯺��в��� 2 ������ true ���������ڰ��� [1,2] ��
        randomizedSet.remove(0); // ���� false ����ʾ�����в����� 2 ��
//        randomizedSet.getRandom(); // getRandom Ӧ������� 1 �� 2 ��
//        randomizedSet.remove(0);
        randomizedSet.insert(2); // 2 ���ڼ����У����Է��� false ��
        randomizedSet.remove(1); // �Ӽ������Ƴ� 1 ������ true ���������ڰ��� [2] ��
        randomizedSet.getRandom(); // ���� 2 �Ǽ�����Ψһ�����֣�getRandom ���Ƿ��� 2 ��
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
