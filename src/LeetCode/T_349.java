package LeetCode;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;

public class T_349 {

    public static void main(String[] args) {


    }

    public static int[] intersection(int[] nums1, int[] nums2) {
        HashMap<Integer,Integer> map=new HashMap<>();
        HashSet<Integer> list=new HashSet<>();
        for (int i = 0; i < nums1.length; i++) {
            map.put(nums1[i],nums1[i]);
        }
        for (int i = 0; i < nums2.length; i++) {
            if(map.containsKey(nums2[i])){
                list.add(nums2[i]);
            }
        }
        Iterator<Integer> iterator= list.iterator();
        int[] a=new int[list.size()];
        int x=0;
        while (iterator.hasNext()){
            a[x++]=iterator.next();
        }
        return a;
    }
}

