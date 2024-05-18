package LeetCode;

public class T_643 {
    public static void main(String[] args) {
        findMaxAverage(new int[]{-1},1);

    }

    public static double findMaxAverage(int[] nums, int k) {
        int sum = 0;
        for (int i = 0; i < k; i++) {
            sum+=nums[i];
        }
        int max=sum;
        for (int i = k; i < nums.length; i++) {
            sum=sum-nums[i-k]+nums[i];
            max=Math.max(max,sum);
        }
        return max/(double)k;
    }
}
