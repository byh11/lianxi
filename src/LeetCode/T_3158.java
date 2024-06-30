package LeetCode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class T_3158 {

    public static void main(String[] args) {

        ArrayList<String> a=new ArrayList<>();
        a.add("111");
        a.add("222");
        System.out.println(a.toString());

//        duplicateNumbersXOR(new int[]{1,2,1,3});
    }

    public static int duplicateNumbersXOR(int[] nums) {
        HashMap<Integer,Integer> map=new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            if(map.containsKey(nums[i])){
                map.put(nums[i],map.get(nums[i])+1);
            }else {
                map.put(nums[i],1);
            }
        }
        ArrayList<Integer> list=new ArrayList<>();
        for(Map.Entry<Integer,Integer> m:map.entrySet()){
            if (m.getValue()==2){
                list.add(m.getKey());
            }
        }
        if(list.size()==0){
            return 0;
        }
        int a=list.get(0);
        for (int i = 1; i < list.size(); i++) {
            a=a^list.get(i);
        }
        return a;
    }
}
