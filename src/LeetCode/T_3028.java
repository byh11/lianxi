package LeetCode;

public class T_3028 {

    public static void main(String[] args) {


    }

    public static int returnToBoundaryCount(int[] nums) {
        int n=0;
        int m=0;
        for (int i = 0; i < nums.length; i++) {
            m+=nums[i];
            if(m==0){
                n++;
            }
        }
        return n;
    }
}
