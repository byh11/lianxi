package LeetCode;

import java.util.Arrays;

public class T_455 {

    public static void main(String[] args) {
        findContentChildren(new int[]{10,9,8,7},new int[]{5,6,7,8});

    }

    public static int findContentChildren(int[] g, int[] s) {

        int sum=0;
        Arrays.sort(g);
        Arrays.sort(s);
        int i=0,j=0;
        while (i<g.length && j<s.length){
            if(s[j]>=g[i]){
                sum++;
                j++;
                i++;
            }else {
                j++;
            }
        }
        return sum;

    }
}
