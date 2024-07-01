package LeetCode;

import java.util.HashMap;

public class T_3046 {

    public static void main(String[] args) {


    }

    public boolean isPossibleToSplit(int[] nums) {
        HashMap<Integer,Integer>map=new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            if(map.containsKey(nums[i])){
                map.put(nums[i],map.get(nums[i])+1);
                if(map.get(nums[i])>2){
                    return false;
                }
            }else {
                map.put(nums[i], 1);
            }
        }
        return true;
    }
}
