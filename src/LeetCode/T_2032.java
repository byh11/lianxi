package LeetCode;

import java.util.*;

public class T_2032 {

    public static void main(String[] args) {


    }

    public static List<Integer> twoOutOfThree(int[] nums1, int[] nums2, int[] nums3) {
        HashMap<Integer,Integer> map=new HashMap<>();
        Set<Integer> set1=new HashSet<>();
        Set<Integer> set2=new HashSet<>();
        Set<Integer> set3=new HashSet<>();
        for (int num : nums1) {
            set1.add(num);
        }
        for (int num : nums2) {
            set2.add(num);
        }
        for (int num : nums3) {
            set3.add(num);
        }
        for(int i:set1){
            if(map.containsKey(i)){
                map.put(i,map.get(i)+1);
            }else {
                map.put(i,1);
            }
        }
        for(int i:set2){
            if(map.containsKey(i)){
                map.put(i,map.get(i)+1);
            }else {
                map.put(i,1);
            }
        }for(int i:set3){
            if(map.containsKey(i)){
                map.put(i,map.get(i)+1);
            }else {
                map.put(i,1);
            }
        }
        ArrayList<Integer> list=new ArrayList<>();
        for(Map.Entry<Integer,Integer> m:map.entrySet()){
            if (m.getValue()>=2){
                list.add(m.getKey());
            }
        }
        return list;
    }
}
