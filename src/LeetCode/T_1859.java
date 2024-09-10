package LeetCode;

import java.util.HashMap;

/**
 * @Author 白云浩
 * @Date 2024/9/10 21:47
 * @注释
 */

public class T_1859 {

    public static void main(String[] args) {

        sortSentence("is2 sentence4 This1 a3");
    }

    public static String sortSentence(String s) {
        String[] strings = s.split(" ");
        HashMap<String, String> map = new HashMap<>();
        for (int i = 0; i < strings.length; i++) {
            map.put(strings[i].substring(strings[i].length() - 1), strings[i].substring(0, strings[i].length() - 1));
        }
        StringBuilder res = new StringBuilder();
        for (int i = 0; i < map.size(); i++) {
            if (i == map.size() - 1) {
                res.append(map.get(String.valueOf(i + 1)));
            } else {
                res.append(map.get(String.valueOf(i + 1))).append(" ");
            }
        }
        return res.toString();
    }
}
