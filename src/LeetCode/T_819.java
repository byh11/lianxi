package LeetCode;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

/**
 * @Author °×ÔÆºÆ
 * @Date 2024/8/6 16:57
 * @×¢ÊÍ
 */

public class T_819 {

    public static void main(String[] args) {

        mostCommonWord("Bob hit a ball, the hit BALL flew far after it was hit.", new String[]{"hit"});
    }

    public static String mostCommonWord(String paragraph, String[] banned) {
        paragraph = paragraph.toLowerCase();
        String[] tokens = paragraph.split("\\W+");
        HashMap<String, Integer> map = new HashMap<>();
        HashSet<String> set = new HashSet<>();
        for (int i = 0; i < banned.length; i++) {
            set.add(banned[i]);
        }
        for (int i = 0; i < tokens.length; i++) {
            if (map.containsKey(tokens[i])) {
                map.put(tokens[i], map.get(tokens[i]) + 1);
            } else {
                map.put(tokens[i], 1);
            }
        }
        String res = "";
        int max = 0;
        for (Map.Entry<String, Integer> m : map.entrySet()) {
            if (!set.contains(m.getKey())) {
                if (m.getValue() > max) {
                    max = m.getValue();
                    res = m.getKey();
                }
            }
        }
        return res;
    }

}
