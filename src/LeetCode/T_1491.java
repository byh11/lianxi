package LeetCode;

import java.util.Arrays;

/**
 * @Author °×ÔÆºÆ
 * @Date 2024/7/8 21:40
 * @×¢ÊÍ
 */

public class T_1491 {

    public static void main(String[] args) {


    }

    public double average(int[] salary) {
        Arrays.sort(salary);
        salary[0]=0;
        salary[salary.length-1]=0;
        return Arrays.stream(salary).sum()*1.0/ (salary.length-2);
    }
}
