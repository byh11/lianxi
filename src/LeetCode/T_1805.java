package LeetCode;

import java.util.HashSet;

/**
 * @Author 白云浩
 * @Date 2024/9/19 9:37
 * @注释
 */

public class T_1805 {

    public static void main(String[] args) {

        numDifferentIntegers("a123bc34d8ef34");
    }

    public static int numDifferentIntegers(String word) {
        HashSet set = new HashSet();
        String s = "";
        boolean b = false;
        for (int i = 0; i < word.length(); i++) {
            if (word.charAt(i) >= '0' && word.charAt(i) <= '9') {
                b = true;
            } else {
                b = false;
            }
            if (b) {
                s += word.charAt(i);
            } else {
                while (true) {
                    if (!s.isEmpty() && s.charAt(0) == '0' && s.length() != 1) {
                        s = s.substring(1);
                    } else {
                        if (!s.isEmpty()) {
                            set.add(s);
                            s = "";
                        }
                        break;
                    }
                }
            }
        }
        while (true) {
            if (!s.isEmpty() && s.charAt(0) == '0' && s.length() != 1) {
                s = s.substring(1);
            } else {
                if (!s.isEmpty()) {
                    set.add(s);
                    s = "";
                }
                break;
            }
        }
        return set.size();
    }
}
