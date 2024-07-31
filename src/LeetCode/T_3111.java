package LeetCode;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

/**
 * @Author °×ÔÆºÆ
 * @Date 2024/7/31 20:27
 * @×¢ÊÍ
 */

public class T_3111 {

    public static void main(String[] args) {

        minRectanglesToCoverPoints(new int[][]{{1, 3}, {5, 3}, {7, 3}}, 1);
    }

    public static int minRectanglesToCoverPoints(int[][] points, int w) {
        int a = 1;
        Set<Integer> set = new HashSet<>();
        for (int i = 0; i < points.length; i++) {
            set.add(points[i][0]);
        }
        if (w == 0) {
            return set.size();
        }
        Integer[] arr = set.toArray(new Integer[0]);
        Arrays.sort(arr);
        int start = arr[0];
        int end = start + w;
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] == end) {
                if (i == arr.length - 1 && arr[i] == end){
                    a--;
                }
                start = i + 1 < arr.length ? arr[i + 1] : arr[i];
                end = start + w;
                a++;
            }else if(arr[i] > end){
                if (i == arr.length - 1 && arr[i] == end){
                    a--;
                }
                start =  arr[i];
                end = start + w;
                a++;
            }
        }
        return a;
    }

}
