package LeetCode;

import java.util.Arrays;

public class T_2578 {

    public static void main(String[] args) {


    }

    public static int splitNum(int num) {
        String s=String.valueOf(num);
        int[] nums=new int[s.length()];
        for (int i = 0; i < s.length(); i++) {
            nums[i]=Integer.valueOf(s.substring(i,i+1));
        }
        Arrays.sort(nums);
        String s1="";
        String s2="";
        for (int i = 0; i < nums.length; i++) {
            if(i%2==0){
                s1+=nums[i];
            }else {
                s2+=nums[i];
            }
        }
        return Integer.valueOf(s1)+Integer.valueOf(s2);
    }
}
