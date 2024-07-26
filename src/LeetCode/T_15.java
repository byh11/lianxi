package LeetCode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.stream.IntStream;

/**
 * @Author °×ÔÆºÆ
 * @Date 2024/7/26 15:46
 * @×¢ÊÍ
 */

public class T_15 {

    public static void main(String[] args) {

        threeSum(new int[]{-1,0,1,-1,2,4});
    }

    public static List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums);
        List<List<Integer>> list=new ArrayList<>();
        nums= IntStream.of(nums).distinct().toArray();
        for (int i = 0; i < nums.length; i++) {
            for (int j = i+1; j < nums.length; j++) {
                for (int k = j+1; k < nums.length; k++) {
                    if(i != j && j != k && k != i && (nums[i] + nums[j] + nums[k] == 0)){
                        ArrayList<Integer> l=new ArrayList<>();
                        l.add(nums[i]);
                        l.add(nums[j]);
                        l.add(nums[k]);
                        list.add(l);
                    }
                }
            }
        }
        return list;
    }
}


