package LeetCode;

import java.util.Arrays;

public class T_3194 {
    public static void main(String[] args) {

        minimumAverage(new int[]{7,8,3,4,15,13,4,1});
    }

    public static double minimumAverage(int[] nums) {
        Arrays.sort(nums);
        double[] a=new double[nums.length/2];
        for (int i = 0; i < nums.length/2; i++) {
            a[i]=Double.valueOf(nums[i]+nums[nums.length-1-i])/2;
        }
        double min=Integer.MAX_VALUE;
        for (int i = 0; i < a.length; i++) {
            min=Math.min(min,a[i]);
        }
        return min;
    }
}
