package LeetCode;

import java.util.HashMap;

public class M_01_02 {
    public static void main(String[] args) {
        System.out.println(CheckPermutation("abc", "aac"));
    }

    public static boolean CheckPermutation(String s1, String s2) {
        if (s1.length() != s2.length()) {
            return false;
        }
        HashMap<Character, Integer> map = new HashMap<>();
        for (int i = 0; i < s1.length(); i++) {
            map.put(s1.charAt(i),map.getOrDefault(s1.charAt(i),0)+1);
        }
        for (int i = 0; i < s2.length(); i++) {
            if (map.containsKey(s2.charAt(i))) {
                map.put(s2.charAt(i),map.get(s2.charAt(i))-1);
                if(map.get(s2.charAt(i))==0){
                    map.remove(s2.charAt(i));
                }
            } else {
                return false;
            }
        }
        return true;
    }
}
