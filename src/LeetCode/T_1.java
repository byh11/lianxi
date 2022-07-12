package LeetCode;

public class T_1 {
    public static void main(String[] args) {

    }
    public int[] twoSum(int[] nums, int target) {
        int[] a=new int[2];
        for(int i=0;i<nums.length;++i){
            for(int p=i+1;p<nums.length;++p){
                if(nums[i]+nums[p]==target){
                    a[0]=i;
                    a[1]=p;
                    return a;
                }
            }
        }
        return a;
    }
}
