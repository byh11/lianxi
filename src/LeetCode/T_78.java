package LeetCode;

import java.util.ArrayList;
import java.util.List;

public class T_78 {

    public static void main(String[] args) {
        subsets(new int[]{1,2,3});
    }

    public static List<List<Integer>> subsets(int[] nums) {

        List<List<Integer>> lists=new ArrayList<>();
        lists.add(new ArrayList<>());
        c(nums,0,new ArrayList<>(),lists);

        return lists;

    }


    public static void c(int[] nums,int x,List<Integer> list,List<List<Integer>> lists){
        if(x==nums.length){
            return;
        }
        for (int i = x; i < nums.length; i++) {
            list.add(nums[i]);
            c(nums,i+1,list,lists);
            lists.add(new ArrayList<>(list));
            list.remove(list.size()-1);
        }


    }

}
