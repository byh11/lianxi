package LeetCode;

import java.util.HashMap;

public class T_657 {

    public static void main(String[] args) {


    }

    public static boolean judgeCircle(String moves) {
        HashMap<Character, Integer> map = new HashMap<>();
        map.put('U', 0);
        map.put('D', 0);
        map.put('L', 0);
        map.put('R', 0);
        for (int i = 0; i < moves.length(); i++) {
            map.put(moves.charAt(i), map.get(moves.charAt(i)) + 1);
        }
        if (map.get('U').equals(map.get('D')) && map.get('L').equals(map.get('R'))) {
            return true;
        } else {
            return false;
        }
    }
}
