package LeetCode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class T_229 {

    public static void main(String[] args) {

        majorityElement(new int[]{3,2,3});
    }

    public static List<Integer> majorityElement(int[] nums) {
        ArrayList<Integer> list=new ArrayList<>();
        Arrays.sort(nums);
        int n=nums.length/3;
        int x=1;
        for (int i = 1; i < nums.length; i++) {
            if(nums[i]==nums[i-1]){
                x++;
            }else {
                if(x>n){
                    list.add(nums[i-1]);
                }
                x=1;
            }
        }
        if(x>n){
            list.add(nums[nums.length-1]);
        }
        return list;
    }
}
