package LeetCode;

/**
 * @Author °×ÔÆºÆ
 * @Date 2024/8/6 16:55
 * @×¢ÊÍ
 */

public class T_693 {

    public static void main(String[] args) {


    }

    public static boolean hasAlternatingBits(int n) {
        String s = Integer.toBinaryString(n);
        boolean b = true;
        for (int i = 1; i < s.length(); i++) {
            if (s.charAt(i - 1) == s.charAt(i)) {
                b = false;
                break;
            }
        }
        return b;
    }
}
