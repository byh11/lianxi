package LeetCode;

import java.util.ArrayList;
import java.util.Arrays;

public class T_899 {
    public static String orderlyQueue(String s, int k) {
        String a = "";
        char[] s1 = new char[s.length()];
        s1 = s.toCharArray();
        Arrays.sort(s1);
        if (k >= 2) {
            a = String.copyValueOf(s1);
            return a;
        }
        char[] s2 = s.toCharArray();
        String smallest = s;
        StringBuilder sb = new StringBuilder(s);
        int n = s.length();
        for (int i = 1; i < n; i++) {
            char c = sb.charAt(0);
            sb.deleteCharAt(0);
            sb.append(c);
            if (sb.toString().compareTo(smallest) < 0) {
                smallest = sb.toString();
            }
        }
        a = smallest;
        return a;
    }

    public static void main(String[] args) {
        System.out.println(orderlyQueue("xitavoyjqiupzadbdyymyvuteolyeerecnuptghlzsynozeuuvteryojyokpufanyrqqmtgxhyycltlnusyeyyqygwupcaagtkuq",1));
    }
}
