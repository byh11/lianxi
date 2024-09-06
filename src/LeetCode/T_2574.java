package LeetCode;

/**
 * @Author 白云浩
 * @Date 2024/9/6 23:17
 * @注释
 */

public class T_2574 {

    public static void main(String[] args) {


    }

    public int[] leftRightDifference(int[] nums) {
        int s = 0;
        for (int i = 0; i < nums.length; i++) {
            s += nums[i];
        }
        int l = 0;
        int[] leftSum = new int[nums.length];
        int[] rightSum = new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
            leftSum[i] = l;
            l += nums[i];
            s -= nums[i];
            rightSum[i] = s;
        }
        int[] a = new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
            a[i] = Math.abs(leftSum[i] - rightSum[i]);
        }
        return a;
    }
}
