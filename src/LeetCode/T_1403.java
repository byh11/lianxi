package LeetCode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class T_1403 {
    public static List<Integer> minSubsequence(int[] nums) {
        Arrays.sort(nums);
        List<Integer> list=new ArrayList<>();
        int i= nums.length-1;
        int a=0;
        while (true){
            list.add(a++,nums[i--]);
            int s=0;
            for (int j = 0; j <= i; j++) {
                s+=nums[j];
            }
            int n=0;
            for (int j = 0; j < list.size(); j++) {
                n+= list.get(j);
            }
            if(n>s){
                break;
            }
            s=0;
            n=0;
        }
        return list;
    }

    public static void main(String[] args) {
        System.out.println(minSubsequence(new int[]{4,4,7,6,7}).toString());
    }
}
