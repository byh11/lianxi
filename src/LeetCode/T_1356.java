package LeetCode;

import java.util.HashMap;

public class T_1356 {

    public static void main(String[] args) {

        sortByBits(new int[]{0, 1, 2, 3, 4, 5, 6, 7, 8});
    }

    public static int[] sortByBits(int[] arr) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < arr.length; i++) {
            String s = Integer.toBinaryString(arr[i]);
            int a = 0;
            for (int j = 0; j < s.length(); j++) {
                if (s.charAt(j) == '1') {
                    a++;
                }
            }
            map.put(arr[i], a);
        }
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                if (map.get(arr[j]) > map.get(arr[i])) {
                    int t = arr[i];
                    arr[i] = arr[j];
                    arr[j] = t;
                } else if (map.get(arr[j]) == map.get(arr[i]) && arr[j] > arr[i]) {
                    int t = arr[i];
                    arr[i] = arr[j];
                    arr[j] = t;
                }
            }
        }
        return arr;
    }
}
