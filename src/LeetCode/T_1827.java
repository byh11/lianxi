package LeetCode;

import java.util.Arrays;

public class T_1827 {
    public static void main(String[] args) {
        System.out.println(minOperations(new int[]{1,5,2,4,1}));;
    }

    public static int minOperations(int[] nums) {
        int a=0;
        for (int i = 1; i < nums.length; i++) {
            if(nums[i-1]<nums[i]){
                continue;
            }
            nums[i]++;
            i--;
            a++;
        }
        return a;
    }
}
