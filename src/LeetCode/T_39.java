package LeetCode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class T_39 {

    public static void main(String[] args) {

        combinationSum(new int[]{2,6,3,7},7);

    }

    public static List<List<Integer>> combinationSum(int[] candidates, int target) {

        List<List<Integer>> s = new ArrayList<>();

        Arrays.sort(candidates);

        c(candidates,target,0,0,new ArrayList<>(),s);

        return s;
    }

    public static void c(int[] candidates, int target, int sum ,int x, List<Integer> list, List<List<Integer>> s) {
        if(sum>=target){
            return;
        }
        for (int i = x; i < candidates.length; i++) {
            if(sum+candidates[i]>target){
                return;
            }
            sum+=candidates[i];
            list.add(candidates[i]);
            c(candidates,target,sum,i,list,s);
            if(sum==target){
                s.add(new ArrayList<>(list));
            }
            sum-=candidates[i];
            list.remove(list.size()-1);
        }
        return;
    }
}
