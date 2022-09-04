package LeetCode;

public class T_1464 {
    public static int maxProduct(int[] nums) {
        int max=0;
        for (int i = 0; i < nums.length; i++) {
            for (int j = i+1; j < nums.length; j++) {
                if((nums[i]-1)*(nums[j]-1)>max){
                    max=(nums[i]-1)*(nums[j]-1);
                }
            }
        }
        return max;
    }

    public static void main(String[] args) {
        System.out.println(maxProduct(new int[]{1,5,4,5}));
    }
}
