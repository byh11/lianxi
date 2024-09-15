package LeetCode;

/**
 * @Author 白云浩
 * @Date 2024/9/15 15:55
 * @注释
 */

public class T_2390 {

    public static void main(String[] args) {

        removeStars("leet**cod*e");
    }

    public static String removeStars(String s) {
        StringBuilder res = new StringBuilder();
        for (char c : s.toCharArray()) {
            if (c != '*') {
                res.append(c);
            } else {
                res.setLength(res.length() - 1);
            }
        }
        return res.toString();
    }
}
