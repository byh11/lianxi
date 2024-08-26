package LeetCode;

/**
 * @Author °×ÔÆºÆ
 * @Date 2024/8/26 20:36
 * @×¢ÊÍ
 */

public class T_551 {

    public static void main(String[] args) {


    }

    public static boolean checkRecord(String s) {
        int a = 0;
        int x = 0;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == 'A') {
                a++;
                x = 0;
            } else if (s.charAt(i) == 'L') {
                x++;
            } else {
                x = 0;
            }
            if (a > 1) {
                return false;
            }
            if (x == 3) {
                return false;
            }
        }
        return true;
    }


}
