package LeetCode;

/**
 * @Author °×ÔÆºÆ
 * @Date 2024/8/14 14:25
 * @×¢ÊÍ
 */

public class T_167 {

    public static void main(String[] args) {

        twoSum(new int[]{2, 3, 4}, 6);
    }

    public static int[] twoSum(int[] numbers, int target) {
        int l = 0, r = numbers.length - 1;
        while (l < r) {
            if (numbers[l] + numbers[r] == target) {
                return new int[]{l + 1, r + 1};
            } else if (numbers[l] + numbers[r] < target) {
                l++;
            } else {
                r--;
            }
        }
        return new int[]{-1, -1};
    }
}
