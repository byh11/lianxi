package LeetCode;

/**
 * @Author 白云浩
 * @Date 2024/9/11 9:20
 * @注释
 */

public class T_1652 {

    public static void main(String[] args) {

        decrypt(new int[]{5, 7, 1, 4}, 3);
    }

    public static int[] decrypt(int[] code, int k) {
        int[] c1 = new int[code.length];
        for (int i = 0; i < code.length; i++) {
            c1[i] = code[i];
        }
        for (int i = 0; i < code.length; i++) {
            if (k == 0) {
                code[i] = 0;
            } else if (k > 0) {
                int n = 0;
                int j = 0;
                int m = i + 1;
                while (j < k) {
                    if (m == code.length) {
                        m = 0;
                    }
                    n += c1[m++];
                    j++;
                }
                code[i] = n;
            } else {
                int n = 0;
                int j = 0;
                int m = i - 1;
                while (j < Math.abs(k)) {
                    if (m < 0) {
                        m = code.length - 1;
                    }
                    n += c1[m--];
                    j++;
                }
                code[i] = n;
            }
        }
        return code;
    }

}
