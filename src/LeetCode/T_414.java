package LeetCode;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

/**
 * @Author °×ÔÆºÆ
 * @Date 2024/7/18 17:44
 * @×¢ÊÍ
 */

public class T_414 {

    public static void main(String[] args) {


    }

    public static int thirdMax(int[] nums) {
        Set<Integer> set=new HashSet();
        for (int i = 0; i < nums.length; i++) {
            set.add(nums[i]);
        }
        int[] n=new int[set.size()];
        int i=0;
        for (Integer a : set) {
            n[i++]=a;
        }
        Arrays.sort(n);
        if (n.length>=3){
            return n[n.length-3];
        }else {
            return n[n.length-1];
        }
    }
}
