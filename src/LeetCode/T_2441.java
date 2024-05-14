package LeetCode;

import java.util.ArrayList;
import java.util.Arrays;

public class T_2441 {

    public static void main(String[] args) {
        findMaxK(new int[]{-1,10,6,7,-7,1});

    }

    public static int findMaxK(int[] nums) {
        Arrays.sort(nums);
        ArrayList<Integer> list=new ArrayList<>();
        for (int i = 0; i < nums.length; i++) {
            list.add(nums[i]);
        }
        for (int i = 0; i < list.size(); i++) {
            if(list.get(i)<0 && list.contains(Math.abs(list.get(i)))){
                return Math.abs(list.get(i));
            }
        }
        return -1;
    }
}
