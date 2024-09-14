package LeetCode;

/**
 * @Author 白云浩
 * @Date 2024/9/12 14:18
 * @注释
 */

public class T_2798 {

    public static void main(String[] args) {


    }


    public static int numberOfEmployeesWhoMetTarget(int[] hours, int target) {
        int a = 0;
        for (int i = 0; i < hours.length; i++) {
            if (hours[i] >= target) {
                a++;
            }
        }
        return a;
    }
}
