package LeetCode;

import java.util.ArrayList;
import java.util.Arrays;

public class T_3038 {
    public static void main(String[] args) {

        maxOperations(new int[]{3,2,1,4,5});
    }

    public static int maxOperations(int[] nums) {
        int a=0;
        int x=0;
        ArrayList<Integer> list=new ArrayList<>();
        for (int i = 0; i < nums.length; i++) {
            list.add(nums[i]);
        }
        if(list.size()>=2){
            x=list.get(0)+list.get(1);
            list.remove(0);
            list.remove(0);
            a++;
        }
        while (list.size()>=2){
            int m=list.get(0)+list.get(1);
            if(x==m){
                list.remove(0);
                list.remove(0);
                a++;
                continue;
            }
            break;
        }
        return a;
    }
}
