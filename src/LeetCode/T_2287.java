package LeetCode;

import java.util.HashMap;
import java.util.Map;

public class T_2287 {

    public static void main(String[] args) {


    }

    public static int rearrangeCharacters(String s, String target) {
        HashMap<Character,Integer> m1=new HashMap<>();
        HashMap<Character,Integer> m2=new HashMap<>();
        for (int i = 0; i < target.length(); i++) {
            if(m1.containsKey(target.charAt(i))){
                m1.put(target.charAt(i),m1.get(target.charAt(i))+1);
            }else {
                m1.put(target.charAt(i),1);
            }
        }
        for (int i = 0; i < s.length(); i++) {
            if(m2.containsKey(s.charAt(i))){
                m2.put(s.charAt(i),m2.get(s.charAt(i))+1);
            }else {
                m2.put(s.charAt(i),1);
            }
        }
        int a=0;
        while (true){
            for (Map.Entry<Character,Integer> entry: m1.entrySet()){
                if(m2.containsKey(entry.getKey())){
                    m2.put(entry.getKey(),m2.get(entry.getKey())-entry.getValue());
                    if(m2.get(entry.getKey())<0){
                        return a;
                    }
                }else {
                    return a;
                }
            }
            a++;
        }

    }
}
