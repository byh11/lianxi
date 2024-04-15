package LeetCode;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class T_46 {

    public static void main(String[] args) {

        permute(new int[]{1,1,2});

    }

    public static List<List<Integer>> permute(int[] nums) {

        List<List<Integer>> lists=new ArrayList<>();

        c(nums,0,new ArrayList<>(),lists,new boolean[nums.length]);

        return lists;
    }


    public static void c(int[] nums,int x,List<Integer> list,List<List<Integer>> lists,boolean[] u){
        if(x==nums.length){
            lists.add(new ArrayList<>(list));
            return;
        }
        Set<Integer> set=new HashSet<>();
        for (int i = 0; i < nums.length; i++) {
            if(set.contains(nums[i])){
                continue;
            }
            if(u[i]==false) {
                list.add(nums[i]);
                set.add(nums[i]);
                u[i] = true;
            }else {
                continue;
            }
            c(nums,x+1,list,lists,u);
            list.remove(list.size()-1);
            u[i] = false;
        }
    }
}
