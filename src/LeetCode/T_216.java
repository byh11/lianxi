package LeetCode;

import java.util.ArrayList;
import java.util.List;

public class T_216 {

    public static void main(String[] args) {
        combinationSum3(7,3);
    }


    public static List<List<Integer>> combinationSum3(int k, int n) {

        List<List<Integer>> s=new ArrayList<>();

        c(n,k,1,0,new ArrayList<>(),s);

        return s;
    }

    public static List<List<Integer>> c(int n,int k,int x,int sum,List<Integer> list,List<List<Integer>> s) {
        if (list.size()==k || sum>n){
            return null;
        }
        for (int i = x; i <= 9; i++) {
            list.add(i);
            sum+=i;
            c(n,k,i+1,sum,list,s);
            if(sum==n && list.size()==k){
                s.add(new ArrayList<>(list));
            }
            sum-=i;
            list.remove(list.size()-1);
        }
        return s;
    }
}
