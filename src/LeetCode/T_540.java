package LeetCode;

public class T_540 {
    public static void main(String[] args) {
        System.out.println(singleNonDuplicate(new int[]{3,3,7}));
    }

    public static int singleNonDuplicate(int[] nums) {
        for (int i = 0; i < nums.length-1; i+=2) {
            if(nums[i]!=nums[i+1]){
                return nums[i];
            }
        }
        return nums[nums.length-1];
    }
}
