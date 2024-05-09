package LeetCode;

import java.util.ArrayList;

public class T_1389 {

    public static void main(String[] args) {

        createTargetArray(new int[]{0,1,2,3,4},new int[]{0,1,2,2,1});
    }

    public static int[] createTargetArray(int[] nums, int[] index) {
        ArrayList<Integer> list=new ArrayList<>();
        for (int i = 0; i < nums.length; i++) {
            list.add(index[i],nums[i]);
        }
        int[] target=new int[nums.length];
        for (int i = 0; i < list.size(); i++) {
            target[i]=list.get(i);
        }
        return target;
    }
}
