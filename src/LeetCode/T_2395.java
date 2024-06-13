package LeetCode;

import java.util.HashMap;

public class T_2395 {

    public static void main(String[] args) {


    }

    public static boolean findSubarrays(int[] nums) {
        HashMap<Integer,Integer> map=new HashMap<>();
        for (int i = 0; i < nums.length-2; i++) {
            int n=nums[i]+nums[i+1];
            if(map.containsKey(n)){
                return true;
            }else {
                map.put(n,1);
            }
        }
        return false;
    }
}
