package LeetCode;

import java.util.HashMap;

public class T_1189 {

    public static void main(String[] args) {


    }

    public static int maxNumberOfBalloons(String text) {
        HashMap<Character,Integer> map=new HashMap<>();
        for (int i = 0; i < text.length(); i++) {
            if(map.containsKey(text.charAt(i))){
                map.put(text.charAt(i),map.get(text.charAt(i))+1);
            }else {
                map.put(text.charAt(i),1);
            }
        }
        int x=0;
        while (true){
            if( (map.containsKey('b')&&map.get('b')>0) && (map.containsKey('a')&&map.get('a')>0) && (map.containsKey('n')&&map.get('n')>0)
                && (map.containsKey('l')&&map.get('l')>1) && (map.containsKey('o')&&map.get('o')>1)){
                map.put('b',map.get('b')-1);
                map.put('a',map.get('a')-1);
                map.put('n',map.get('n')-1);
                map.put('l',map.get('l')-2);
                map.put('o',map.get('o')-2);
            }else {
                break;
            }
            x++;
        }
        return x;
    }
}
