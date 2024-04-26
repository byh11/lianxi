package LeetCode;

import java.util.HashMap;

public class T_290 {

    public static void main(String[] args) {
        wordPattern("abba","dog cat cat fish");


    }

    public static boolean wordPattern(String pattern, String s) {
        HashMap<Character,String> map=new HashMap<>();
        String[] s1 = s.split(" ");
        if(s1.length!=pattern.length()){
            return false;
        }
        for (int i = 0; i < pattern.length(); i++) {
            if(!map.containsValue(s1[i]) && !map.containsKey(pattern.charAt(i))){
                map.put(pattern.charAt(i),s1[i]);
            }
        }
        for (int i = 0; i < pattern.length(); i++) {
            if(map.containsKey(pattern.charAt(i))){
                if(!(map.get(pattern.charAt(i)).equals(s1[i]))){
                    return false;
                }
            }else {
                return false;
            }
        }
        return true;
    }
}
