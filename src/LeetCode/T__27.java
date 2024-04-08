package LeetCode;

public class T__27 {

    public static void main(String[] args) {
        System.out.println(removeElement(new int[]{3, 2, 2, 3}, 3));
    }

    public static int removeElement(int[] nums, int val) {
        int a=0;
        for (int i = 0; i < nums.length-a; i++) {
            if(nums[i] == val){
                for (int j = i; j < nums.length-1; j++) {
                    nums[j] = nums[j+1];
                }
                a++;
                i--;
            }
        }
        return nums.length-a;
    }
}
