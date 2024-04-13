package LeetCode;

import java.util.*;

public class T_491 {

    public static void main(String[] args) {
        subsetsWithDup(new int[]{1,1,1,1,1});
    }

    public static List<List<Integer>> subsetsWithDup(int[] nums) {

        List<List<Integer>> lists=new ArrayList<>();

        c(nums,0,new ArrayList<>(),lists);

        return lists;
    }

    private static void c(int[] nums, int x, ArrayList<Integer> list, List<List<Integer>> lists) {
        if(x==nums.length){
            return;
        }
        Set<Integer> set=new HashSet<>();
        for (int i = x; i < nums.length; i++) {
            if(list.size()>=1 && list.get(list.size()-1)>nums[i]){
                continue;
            }
            if(set.contains(nums[i])){
                continue;
            }
            list.add(nums[i]);
            set.add(nums[i]);
            c(nums,i+1,list,lists);
            if(list.size()>=2){
                lists.add(new ArrayList<>(list));
            }
            list.remove(list.size()-1);
        }
    }
}
