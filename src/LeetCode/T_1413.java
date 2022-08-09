package LeetCode;

public class T_1413 {
    public static int minStartValue(int[] nums) {
        int a=0;
        for (int i = 1; i < Integer.MAX_VALUE; i++) {
            a=i;
            int j=0;
            for (j = 0; j < nums.length; j++) {
                a+=nums[j];
                if(a<1){
                    break;
                }
            }
            if(j==nums.length){
                return i;
            }
        }
        return a;
    }

    public static void main(String[] args) {
        System.out.println(minStartValue(new int[]{1,2}));
    }
}
