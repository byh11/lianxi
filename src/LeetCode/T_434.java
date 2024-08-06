package LeetCode;

/**
 * @Author °×ÔÆºÆ
 * @Date 2024/8/6 16:06
 * @×¢ÊÍ
 */

public class T_434 {

    public static void main(String[] args) {


    }

    public static int countSegments(String s) {
        int num = 0;
        for (int i = 0; i < s.length(); i++) {
            if ((i == 0 || s.charAt(i - 1) == ' ') && s.charAt(i) != ' ') {
                num++;
            }
        }

        return num;
    }
}
