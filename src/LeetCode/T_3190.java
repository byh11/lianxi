package LeetCode;

public class T_3190 {

    public static void main(String[] args) {

        minimumOperations(new int[]{1,2,3,4});
    }

    public static int minimumOperations(int[] nums) {
        int n=0;
        for (int i = 0; i < nums.length; i++) {
            if(nums[i]%3!=0){
                if (nums[i]%3==2){
                    nums[i]++;
                }else if(nums[i]%3==1){
                    nums[i]--;
                }
                i--;
                n++;
            }
        }
        return n;
    }
}
