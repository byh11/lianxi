package LeetCode;

import java.time.LocalDateTime;

/**
 * @Author ���ƺ�
 * @Date 2024/8/28 21:37
 * @ע��
 */

public class T_1816 {

    public static void main(String[] args) {
        System.out.println(LocalDateTime.now());

    }

    public static String truncateSentence(String s, int k) {
        String[] a = s.split(" ");
        StringBuilder res = new StringBuilder();
        for (int i = 0; i < k; i++) {
            if (i == k - 1) {
                res.append(a[i]);
                break;
            }
            res.append(a[i]);
            res.append(" ");
        }
        return res.toString();
    }
}
