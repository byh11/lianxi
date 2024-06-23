package LeetCode;

import java.util.HashMap;

public class T_1684 {

    public static void main(String[] args) {


    }

    public static int countConsistentStrings(String allowed, String[] words) {
        int n = 0;
        HashMap<Character, Integer> map = new HashMap<>();
        for (int i = 0; i < allowed.length(); i++) {
            map.put(allowed.charAt(i), 1);
        }
        for (int i = 0; i < words.length; i++) {
            boolean b=true;
            for (int j = 0; j < words[i].length(); j++) {
                if(!map.containsKey(words[i].charAt(j))){
                    b=false;
                    break;
                }
            }
            if(b){
                n++;
            }
        }
        return n;
    }
}
