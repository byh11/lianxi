package LeetCode;

/**
 * @Author 白云浩
 * @Date 2024/9/19 8:44
 * @注释
 */

public class T_2595 {

    public static void main(String[] args) {

        evenOddBit(2);
    }

    public static int[] evenOddBit(int n) {
        String b = Integer.toBinaryString(n);
        String b1 = "";
        for (int i = 0; i < b.length(); i++) {
            b1 = String.valueOf(b.charAt(i)) + b1;
        }
        b = b1;
        int a = 0;
        int c = 0;
        for (int i = 0; i < b.length(); i++) {
            if (b.charAt(i) == '1' && i % 2 == 0) {
                a++;
            } else if (b.charAt(i) == '1' && i % 2 != 0) {
                c++;
            }
        }
        return new int[]{a, c};
    }

}
