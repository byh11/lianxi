package LeetCode;

import java.security.KeyStore;
import java.util.HashMap;
import java.util.Map;

public class T_2085 {

    public static void main(String[] args) {
        countWords(new String[]{"leetcode","is","amazing","as","is"},new String[]{"amazing","leetcode","is"});

    }

    public static int countWords(String[] words1, String[] words2) {
        HashMap<String,Integer> map=new HashMap();
        HashMap<String,Integer> map2=new HashMap();
        for (int i = 0; i < words1.length; i++) {
            if(map.containsKey(words1[i])){
                map.put(words1[i],map.get(words1[1])+1);
            }else {
                map.put(words1[i],1);
            }
        }
        for (int i = 0; i < words2.length; i++) {
            if(map2.containsKey(words2[i])){
                map2.put(words2[i],map2.get(words2[1])+1);
            }else {
                map2.put(words2[i],1);
            }
        }
        int a=0;
        for(Map.Entry<String, Integer> m:map.entrySet()){
            if ((map.get(m.getKey())==1) && (map2.containsKey(m.getKey()) && map2.get(m.getKey())==1)){
                a++;
            }
        }
        return a;
    }
}
