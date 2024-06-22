package LeetCode;

import java.util.Arrays;

public class T_1619 {

    public static void main(String[] args) {


    }

    public static double trimMean(int[] arr) {
        int n= (int) (arr.length*0.05);
        Arrays.sort(arr);
        for (int i = 0; i < n; i++) {
            arr[i]=0;
            arr[arr.length-1-i]=0;
        }
        int x=0;
        for (int i = 0; i < arr.length; i++) {
            x+=arr[i];
        }
        return (double) x/(arr.length-2*n);
    }
}
