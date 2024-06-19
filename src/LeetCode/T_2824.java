package LeetCode;

import java.util.List;

public class T_2824 {

    public static void main(String[] args) {


    }

    public static int countPairs(List<Integer> nums, int target) {
        int n=0;
        for (int i = 0; i < nums.size(); i++) {
            for (int j = i+1; j < nums.size(); j++) {
                if(nums.get(i)+nums.get(j)<target){
                    n++;
                }
            }
        }
        return n;
    }
}
