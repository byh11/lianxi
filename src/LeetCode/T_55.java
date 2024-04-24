package LeetCode;

public class T_55 {

    public static void main(String[] args) {
        canJump(new int[]{2,0,0});

    }

    public static boolean canJump(int[] nums) {
        int x=nums[0];
        for (int i = 0; i < nums.length; i++) {
            x--;
            x=Math.max(x,nums[i]);
            if(x==0 && i!=nums.length-1)
                return false;
        }
        return true;
    }
}
