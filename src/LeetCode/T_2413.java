package LeetCode;

/**
 * @Author 白云浩
 * @Date 2024/9/1 21:46
 * @注释
 */

public class T_2413 {

    public static void main(String[] args) {


    }

    public static int smallestEvenMultiple(int n) {
        if (n % 2 == 0) {
            return n;
        }
        return 2 * n;
    }
}
