package LeetCode;

import java.util.HashMap;

public class T_3146 {

    public static void main(String[] args) {

        findPermutationDifference("rwohu","rwuoh");
    }

    public static int findPermutationDifference(String s, String t) {
        HashMap<Character,Integer> map=new HashMap<>();
        for (int i = 0; i < s.length(); i++) {
            map.put(s.charAt(i),i);
        }
        int n=0;
        for (int i = 0; i < s.length(); i++) {
            n+=Math.abs(map.get(s.charAt(i))-map.get(t.charAt(i)));
        }
        return n;
    }
}
