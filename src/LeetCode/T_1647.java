package LeetCode;

import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

public class T_1647 {

    public static void main(String[] args) {

        minDeletions("bbcebab");
    }

    public static int minDeletions(String s) {
        HashMap<Character,Integer> map=new HashMap<>();
        for (int i = 0; i < s.length(); i++) {
            if (map.containsKey(s.charAt(i))){
                map.put(s.charAt(i),map.get(s.charAt(i))+1);
            }else {
                map.put(s.charAt(i),1);
            }
        }
        int n=0;
        Set<Integer> set=new HashSet<>();
        for (int value : map.values()){
            while (true){
                if(value==0){
                    break;
                }
                if(set.contains(value)){
                    value--;
                    n++;
                }else {
                    set.add(value);
                    break;
                }
            }
        }

        /*
        int[] a=new int[map.size()];
        int i=0;
        for (int value : map.values()){
            a[i++]=value;
        }
        Arrays.sort(a);
        boolean b=true;
        while (b){
            b=false;
            for (int j = a.length-1; j > 0; j--) {
                if(a[j]==0||a[j-1]==0){
                    continue;
                }
                if(a[j]==a[j-1]){
                    a[j-1]--;
                    n++;
                    b=true;
                }
            }
            Arrays.sort(a);
        }*/
        return n;
    }
}
