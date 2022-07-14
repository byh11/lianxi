package LeetCode;

public class T_2206 {
    public static void main(String[] args) {
        System.out.println(divideArray(new int[]{9,4,18,3,2,6,18,15,7,15,6,4,15,14,7,4,15,4,3,17,9,13,13,12,2,14,12,17}));
    }
    public static boolean divideArray(int[] nums) {
        int s=nums.length/2;
        int i=0;
        int p=1;
        for (;i< nums.length&& p< nums.length;p++) {
            if (nums[i] == nums[p]) {
                int t = nums[p];
                nums[p] = nums[i + 1];
                nums[i + 1] = t;
                i += 2;
                s--;
                p = i;
            }
        }
        if(s==0){
            return true;
        }
        else return false;
    }
}
