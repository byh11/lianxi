package LeetCode;

public class T_1470 {
    public static int[] shuffle(int[] nums, int n) {
        int[] a=new int[nums.length];
        int x=0;
        for (int i = 0; i < n; i++) {
             a[x++]=nums[i];
             a[x++]=nums[n+i];
        }
        return a;
    }

    public static void main(String[] args) {
        int[] a=shuffle(new int[]{2, 5, 1, 3, 4, 7}, 3);
    }
}
