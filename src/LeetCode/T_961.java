package LeetCode;

import java.util.HashMap;

public class T_961 {

    public static void main(String[] args) {


    }


    public int repeatedNTimes(int[] nums) {
        int n=nums.length/2;
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int i=0;i<nums.length;i++){
            if(map.containsKey(nums[i])){
                map.put(nums[i],map.get(nums[i])+1);
            }else{
                map.put(nums[i],1);
            }
        }
        for(int i=0;i<nums.length;i++){
            if(map.get(nums[i])==n){
                return nums[i];
            }
        }
        return 0;
    }
}
