package LeetCode;

import java.util.Arrays;

public class T_2239 {

    public static void main(String[] args) {


    }

    public static int findClosestNumber(int[] nums) {
        Arrays.sort(nums);
        if(nums[nums.length-1]<0){
            return nums[nums.length-1];
        }
        if(nums[0]>0){
            return nums[0];
        }
        for (int i = 1; i < nums.length; i++) {
            if(nums[i-1]<0 && nums[i]>0){
                return Math.abs(nums[i-1])>nums[i]?nums[i]:Math.abs(nums[i-1])==nums[i]?nums[i]:nums[i-1];
            }
        }
        return 0;
    }
}
