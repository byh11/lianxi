package LeetCode;

import java.util.HashMap;
import java.util.Map;

public class T_136 {

    public static void main(String[] args) {
        
        
    }

    public static int singleNumber(int[] nums) {
        HashMap<Integer,Integer> map=new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            if (map.containsKey(nums[i])){
                map.put(nums[i],map.get(nums[i])+1);
            }else {
                map.put(nums[i],1);
            }
        }
        for (Map.Entry<Integer,Integer> m:map.entrySet()){
            if(m.getValue()==1){
                return m.getKey();
            }
        }
        return 0;
    }
}
