package LeetCode;

import java.util.Arrays;

public class T_670 {
    public static int maximumSwap(int num) {
        String s=String.valueOf(num);
        char[] c=s.toCharArray();
        int x=0;
        for (int i = 0; i < c.length; i--) {
            char max=c[i];
            char min=c[i];
            int n=0;
            for (int j = i+1; j < c.length; j++) {
                if(max<c[j]) {
                    min=max;
                    n=j;
                    max = c[j];
                }
            }
            if(max!=c[i]){
                c[i]=max;
                c[n]=min;
                x++;
            }
            if(x==1){
                break;
            }
        }
        s="";
        for (int i = 0; i < c.length ; i++) {
            s+=c[i];
        }
        return Integer.valueOf(s);
    }

    public static void main(String[] args) {
        System.out.println(maximumSwap(2736));
    }
}
