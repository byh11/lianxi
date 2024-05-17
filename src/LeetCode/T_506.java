package LeetCode;

import java.util.Arrays;
import java.util.HashMap;

public class T_506 {
    public static void main(String[] args) {

        findRelativeRanks(new int[]{1});
    }

    public static String[] findRelativeRanks(int[] score) {
        int[] a=new int[score.length];
        System.arraycopy(score,0,a,0,score.length);
        Arrays.sort(a);
        HashMap<Integer,String> map=new HashMap<>();
        if(a.length>=1){
            map.put(a[a.length-1],"Gold Medal");
        }
        if(a.length>=2){
            map.put(a[a.length-2],"Silver Medal");
        }
        if(a.length>=3){
            map.put(a[a.length-3],"Bronze Medal");
        }
        int x=4;
        for(int i=a.length-4;i>=0;i--){
            map.put(a[i],String.valueOf(x++));
        }
        String[] b=new String[score.length];
        for (int i = 0; i < b.length; i++) {
            b[i]=map.get(score[i]);
        }
        return b;
    }
}
