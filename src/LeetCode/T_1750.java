package LeetCode;

import java.util.ArrayList;

public class T_1750 {

    public static void main(String[] args) {


    }

    public static int minimumLength(String s) {
        int r=s.length()-1,l=0;
        while (l<r && s.charAt(l)==s.charAt(r)){
            char c1=s.charAt(l);
            while (l<=r && s.charAt(l)==c1){
                l++;
            }
            char c2=s.charAt(r);
            while (l<=r && s.charAt(r)==c2){
                r--;
            }
        }
        return r-l+1;
    }
}
