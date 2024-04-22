package LeetCode;

public class T_189 {

    public static void main(String[] args) {
        rotate(new int[]{1,2,3,4,5,6,7},3);

    }

    public static void rotate(int[] nums, int k) {
        if(k>nums.length)
            k=k%nums.length;
        int[] a=new int[nums.length];
        int x=0;
        for (int i = nums.length-k; i < nums.length; i++) {
            a[x++]=nums[i];
        }
        for (int i = 0; i < nums.length-k; i++) {
            a[x++]=nums[i];
        }
        System.arraycopy(a,0,nums,0,nums.length);

    }
}
