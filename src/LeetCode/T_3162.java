package LeetCode;

/**
 * @Author 白云浩
 * @Date 2024/10/12 22:55
 * @注释
 */

public class T_3162 {

    public static void main(String[] args) {

    }

    public int numberOfPairs(int[] nums1, int[] nums2, int k) {
        int n = 0;
        for (int i = 0; i < nums1.length; i++) {
            for (int j = 0; j < nums2.length; j++) {
                if (nums1[i] % (nums2[j] * k) == 0)
                    n++;
            }
        }
        return n;
    }

}
