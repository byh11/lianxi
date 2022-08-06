package LeetCode;

public class T_2057 {
    public static void main(String[] args) {
        System.out.println(smallestEqual(new int[]{4,3,2,1}));
    }

    public static int smallestEqual(int[] nums) {
        for (int i = 0; i < nums.length; i++) {
            if(i%10==nums[i]){
                return i;
            }
        }
        return -1;
    }
}
