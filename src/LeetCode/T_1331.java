package LeetCode;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.HashMap;

public class T_1331 {
    public static void main(String[] args) {
        int[] a=arrayRankTransform(new int[]{-50,-47,-28,-21,38,45,48,-1,-18,9,-4,-13,10,9,8,-41,-42,-35,20,-17,10,5,36,47,6,1,8,3,-50,-23});
        for (int i = 0; i < a.length; i++) {
            System.out.println(a[i]);
        }
    }

    public static int[] arrayRankTransform(int[] arr) {
        int[] a=new int[arr.length];
        for (int i = 0; i < a.length; i++) {
            a[i]=arr[i];
        }
        Arrays.sort(a);
        HashMap<Integer,Integer> map=new HashMap<>();
        for (int i = 0; i < a.length; i++) {
            if(map.get(a[i])==null){
                map.put(a[i],map.size()+1);
            }
        }
        for (int i=0;i<arr.length;++i){
            arr[i]= map.get(arr[i]);
        }
        return arr;
    }
}
