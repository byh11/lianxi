package LeetCode;

import java.util.Arrays;

public class T_1753 {
    public static void main(String[] args) {
        System.out.println(maximumScore(2, 4, 6));
    }

    public static int maximumScore(int a, int b, int c) {
        int[] x=new int[3];
        x[0]=a;
        x[1]=b;
        x[2]=c;
        Arrays.sort(x);
        if(x[0]+x[1]<=x[2]){
            return x[0]+x[1];
        }else {
            return a+b+c>>1;
        }
    }
}
