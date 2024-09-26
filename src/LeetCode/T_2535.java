package LeetCode;

public class T_2535 {

    public static void main(String[] args) {

        differenceOfSum(new int[]{1,15,6,3});
    }

    public static int differenceOfSum(int[] nums) {
        int x=0,y=0;
        for (int i = 0; i < nums.length; i++) {
            x+=nums[i];
            String s=String.valueOf(nums[i]);
            for (int j = 0; j < s.length(); j++) {
                y+=Integer.valueOf(String.valueOf(s.charAt(j)));
            }
        }
        return Math.abs(x-y);
    }
}
