package LeetCode;

import java.util.HashMap;
import java.util.HashSet;

public class T_997 {

    public static void main(String[] args) {

        findJudge(4,new int[][]{{1,3},{1,4},{2,3},{2,4},{4,3}});
    }

    public static int findJudge(int n, int[][] trust) {
        if(n==1){
            return 1;
        }
        HashMap<Integer,Integer> a=new HashMap<>();
        HashMap<Integer,Integer> b=new HashMap<>();
        for (int i = 0; i < trust.length; i++) {
            if (a.containsKey(trust[i][0])){
                a.put(trust[i][0],a.get(trust[i][0])+1);
            }else {
                a.put(trust[i][0],1);
            }
            if (b.containsKey(trust[i][1])){
                b.put(trust[i][1],b.get(trust[i][1])+1);
            }else {
                b.put(trust[i][1],1);
            }
        }
        for (int i = 1; i <= n; i++) {
            if(!a.containsKey(i) && b.containsKey(i) && b.get(i)==n-1){
                return n;
            }
        }
        return -1;
    }
}
