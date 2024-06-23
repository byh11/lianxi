package LeetCode;

import java.util.Arrays;
import java.util.HashMap;

public class T_1287 {

    public static void main(String[] args) {

        findSpecialInteger(new int[]{15,15,21,21,32,32,33,33,33,34,35});
    }

    public static int findSpecialInteger(int[] arr) {
        if(arr.length==1){
            return arr[0];
        }
        int m=0;
        int x=0;
        HashMap<String,Integer>map=new HashMap<>();
        map.put("max",0);
        for (int i = 1; i < arr.length; i++) {
            if(arr[i]==arr[i-1]){
                m++;
            }else {
                if(map.get("max")<m){
                    map.put("max",m);
                    x=arr[i-1];
                    m=1;
                }
            }
        }
        if (map.get("max") < m) {
            map.put("max", m);
            x = arr[arr.length-1];
        }
        return x;
    }
}
