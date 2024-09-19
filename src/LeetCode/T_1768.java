package LeetCode;

/**
 * @Author 白云浩
 * @Date 2024/9/19 9:51
 * @注释
 */

public class T_1768 {

    public static void main(String[] args) {

        mergeAlternately("abc", "123");
    }

    public static String mergeAlternately(String word1, String word2) {
        StringBuilder word = new StringBuilder();
        boolean b = true;
        while (!word1.isEmpty() || !word2.isEmpty()) {
            if (b) {
                if (!word1.isEmpty()) {
                    word.append(word1.charAt(0));
                    word1 = word1.substring(1);
                }
                b = false;
            } else {
                if (!word2.isEmpty()) {
                    word.append(word2.charAt(0));
                    word2 = word2.substring(1);
                }
                b = true;
            }
        }
        return word.toString();
    }
}
