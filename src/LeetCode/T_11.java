package LeetCode;

/**
 * @Author °×ÔÆºÆ
 * @Date 2024/8/14 14:49
 * @×¢ÊÍ
 */

public class T_11 {

    public static void main(String[] args) {

        maxArea(new int[]{1, 8, 6, 2, 5, 4, 8, 3, 7});
    }

    public static int maxArea(int[] height) {
        int max = 0;
        int l = 0, r = height.length - 1;
        while (l < r) {
            int h = Math.min(height[l], height[r]);
            int v = h * (r - l);
            max = Math.max(max, v);
            if (height[l] > height[r]) {
                r--;
            } else {
                l++;
            }
        }
        return max;
    }
}
