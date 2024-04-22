package LeetCode;

import java.util.Arrays;
import java.util.HashMap;

public class T_80 {

    public static void main(String[] args) {

        removeDuplicates(new int[]{1,1,1,1});
    }

    public static int removeDuplicates(int[] nums) {
        int a = 0;
        for (int i = 0; i < nums.length-2-a; i++) {
            if (nums[i] == nums[i + 1] && nums[i] == nums[i + 2]){
                for (int j = i+2; j < nums.length-1-a; j++) {
                    int temp = nums[j];
                    nums[j] = nums[j+1];
                    nums[j+1] = temp;
                }
                a++;
                i--;

            }
        }
        return nums.length-a;
    }
}
