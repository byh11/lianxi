package LeetCode;

import java.util.Arrays;
import java.util.HashMap;

public class T_128 {

    public static void main(String[] args) {


    }

    public static int longestConsecutive(int[] nums) {
        HashMap<Integer,Integer> map = new HashMap<>();
        Arrays.sort(nums);
        for (int i = 0; i < nums.length; i++) {
            if(map.containsKey(nums[i]-1)){
                map.put(nums[i],map.get(nums[i]-1)+1);
            }else {
                map.put(nums[i],1);
            }
        }
        int max = 0;
        for (int x:map.values()){
            if (x>max){
                max=x;
            }
        }
        return max;

    }
}
