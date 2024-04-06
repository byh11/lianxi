package LeetCode;

import java.util.HashSet;
import java.util.LinkedHashSet;

public class T_26 {

    public static void main(String[] args) {
        System.out.println(removeDuplicates(new int[]{-3,-1,0,0,0,3,3}));
    }

    public static int removeDuplicates(int[] nums) {
//        if(nums.length==1){
//            return 1;
//        }
//        int a=0;
//        int s=nums.length;
//        for (int i = 0; i < s; i++) {
//            if(i==s-1){
//                a++;
//                break;
//            }
//            if(nums[i]!=nums[i+1]){
//                a++;
//            }else {
//                for (int j = i; j <nums.length-1 ; j++) {
//                    nums[j]=nums[j+1];
//                }
//                nums[s-1]=-999;
//                s--;
//                i--;
//            }
//        }
//        return a;

        LinkedHashSet<Integer> set=new LinkedHashSet<>();
        for (int i = 0; i < nums.length; i++) {
            set.add(nums[i]);
        }
        int i=0;
        for (int x : set){
            nums[i++]=x;
        }
        return set.size();
    }
}
