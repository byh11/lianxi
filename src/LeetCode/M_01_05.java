package LeetCode;

import java.util.ArrayList;

public class M_01_05 {
    public static void main(String[] args) {
        System.out.println(oneEditAway("", "b"));
    }

    public static boolean oneEditAway(String first, String second) {
        if (first.equals(second)) {
            return true;
        }
        if (Math.abs(first.length() - second.length()) >= 2) {
            return false;
        }
        int a = first.length() < second.length() ? first.length() : second.length();
        for (int i = 0; i < a; i++) {
            if (first.charAt(i) != second.charAt(i)) {
                if (first.length() > second.length()) {
                    String s1 = second.substring(0, i) + first.charAt(i) + second.substring(i, second.length());
                    if (s1.equals(first)) {
                        return true;
                    } else {
                        return false;
                    }
                } else if (first.length() < second.length()) {
                    String s2 = first.substring(0, i) + second.charAt(i) + first.substring(i, first.length());
                    if (s2.equals(second)) {
                        return true;
                    } else {
                        return false;
                    }
                } else {
                    String s3 = first.substring(0, i) + second.charAt(i) + first.substring(i + 1, first.length());
                    if (s3.equals(second)) {
                        return true;
                    } else {
                        return false;
                    }
                }
            }
        }
        return true;
    }
}
