package LeetCode;

/**
 * @Author °×ÔÆºÆ
 * @Date 2024/7/11 20:40
 * @×¢ÊÍ
 */

public class T_2748 {

    public static void main(String[] args) {


    }

    public int countBeautifulPairs(int[] nums) {
        int a=0;
        for (int i = 0; i < nums.length; i++) {
            while (nums[i] >= 10) {
                nums[i] /= 10;
            }
            for (int j = i+1; j < nums.length; j++) {
                if(c(nums[i],nums[j]%10)==1){
                    a++;
                }
            }
        }
        return a;
    }

    public int c(int a,int b){
        if (b == 0) {
            return a;
        } else {
            return c(b, a % b);
        }
    }
}
