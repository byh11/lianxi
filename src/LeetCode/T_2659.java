package LeetCode;

import java.util.ArrayList;
import java.util.Arrays;

//Í¨¹ý505/514
public class T_2659 {

    public static void main(String[] args) {


    }

    public static long countOperationsToEmptyArray(int[] nums) {
        int x=0;
        int[] n=new int[nums.length];
        ArrayList<Integer> list=new ArrayList<>();
        for (int i = 0; i < nums.length; i++) {
            n[i]=nums[i];
            list.add(nums[i]);
        }
        Arrays.sort(n);
        int i=0;
        while (list.size()!=0){
            if(list.get(0)==n[i]){
                list.remove(0);
                x++;
                i++;
            }else {
                list.add(list.get(0));
                list.remove(0);
                x++;
            }
        }
        return x;
    }
}
