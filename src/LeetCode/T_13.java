package LeetCode;

import java.util.HashMap;

/**
 * @Author °×ÔÆºÆ
 * @Date 2024/8/14 14:04
 * @×¢ÊÍ
 */

public class T_13 {

    public static void main(String[] args) {


    }

    public static int romanToInt(String s) {
        HashMap<Character, Integer> map = new HashMap<>();
        map.put('I', 1);
        map.put('V', 5);
        map.put('X', 10);
        map.put('L', 50);
        map.put('C', 100);
        map.put('D', 500);
        map.put('M', 1000);
        int pre = map.get(s.charAt(0));
        int num = 0;
        for (int i = 1; i < s.length(); i++) {
            int n = map.get(s.charAt(i));
            if (pre < n) {
                num -= pre;
            } else {
                num += pre;
            }
            pre = n;
        }
        return num + pre;
    }
}
