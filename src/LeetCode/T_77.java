package LeetCode;

import java.util.ArrayList;
import java.util.List;

public class T_77 {

    public static void main(String[] args) {
        combine(4,2);
    }

    public static List<List<Integer>> combine(int n, int k) {
        List<List<Integer>> s=new ArrayList<>();

        s=c(n,k,1,new ArrayList<>(),s);

        return s;
    }


    public static List<List<Integer>> c(int n,int k,int x,List<Integer> list,List<List<Integer>> s){

        if(k==list.size()){
            return null;
        }
        for (int i = x; i <= n; i++) {
            if(k-list.size()>(n-x+1)){
                return null;
            }
            list.add(i);
            c(n,k,i+1,list,s);
            if(list.size()==k){
                s.add(new ArrayList<>(list));
            }
            list.remove(list.size()-1);
        }

        return s;
    }

}
