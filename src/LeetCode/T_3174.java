package LeetCode;

/**
 * @Author 白云浩
 * @Date 2024/9/5 22:07
 * @注释
 */

public class T_3174 {

    public static void main(String[] args) {

    }

    public String clearDigits(String s) {
        StringBuilder res = new StringBuilder();
        for (char c : s.toCharArray()) {
            if (Character.isDigit(c)) {
                res.deleteCharAt(res.length() - 1);
            } else {
                res.append(c);
            }
        }
        return res.toString();
    }
}
