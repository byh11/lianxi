package LeetCode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class T_40 {

    public static void main(String[] args) {

        combinationSum2(new int[]{10,1,2,7,6,1,5},8);

    }

    public static List<List<Integer>> combinationSum2(int[] candidates, int target) {

        List<List<Integer>> s = new ArrayList<>();

        Arrays.sort(candidates);

        boolean[] u=new boolean[candidates.length];

        c(candidates,target,0,0,new ArrayList<>(),s,u);

        return s;
    }

    public static void c(int[] candidates, int target, int sum ,int x, List<Integer> list, List<List<Integer>> s,boolean[] u) {
        if(sum>=target){
            return;
        }
        for (int i = x; i < candidates.length; i++) {
            if(sum+candidates[i]>target){
                return;
            }
            if(i>=1){
                if(candidates[i]==candidates[i-1]&&!u[i-1]){
                    continue;
                }
            }
            sum+=candidates[i];
            list.add(candidates[i]);
            u[i]=true;
            c(candidates,target,sum,i+1,list,s,u);
            if(sum==target){
                s.add(new ArrayList<>(list));
            }
            sum-=candidates[i];
            list.remove(list.size()-1);
            u[i]=false;
        }
        return;
    }
}
