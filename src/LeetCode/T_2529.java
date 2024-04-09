package LeetCode;

public class T_2529 {

    public static void main(String[] args) {

    }

    public static int maximumCount(int[] nums) {
        int pos = 0;
        int neg = 0;
        for (int i = 0; i < nums.length; i++) {
            if(nums[i] > 0){
                pos++;
            }else if(nums[i] < 0){
                neg++;
            }
        }
        return Math.max(pos,neg);
    }
}
