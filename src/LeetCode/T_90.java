package LeetCode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class T_90 {

    public static void main(String[] args) {
        subsetsWithDup(new int[]{4,6,7,7});
    }

    public static List<List<Integer>> subsetsWithDup(int[] nums) {

        List<List<Integer>> lists=new ArrayList<>();

        lists.add(new ArrayList<>());
        Arrays.sort(nums);

        c(nums,0,new ArrayList<>(),lists,new boolean[nums.length]);

        return lists;
    }

    private static void c(int[] nums, int x, ArrayList<Integer> list, List<List<Integer>> lists, boolean[] u) {
        if(x==nums.length){
            return;
        }
        for (int i = x; i < nums.length; i++) {
            if(i>=1 && nums[i]==nums[i-1] && u[i-1]==false){
                continue;
            }
            list.add(nums[i]);
            u[i]=true;
            c(nums,i+1,list,lists,u);
            lists.add(new ArrayList<>(list));
            list.remove(list.size()-1);
            u[i]=false;

        }
    }
}
