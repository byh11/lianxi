package LeetCode;

import java.util.ArrayList;
import java.util.Arrays;

public class T_482 {

    public static void main(String[] args) {

        licenseKeyFormatting("5F3Z-2e-9-w",4);
    }

    public static String licenseKeyFormatting(String s, int k) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < s.length(); i++) {
            if(s.charAt(i)!='-'){
                sb.append(s.charAt(i));
            }
        }
        s="";
        int n=(sb.length())%k;
        int m=0;
        for (int i = 0; i < sb.length(); i++) {
            m++;
            if(n!=0){
                if((n-1)==i){
                    s+=sb.substring(0,i+1);
                    n=0;
                    m=0;
                }
            }
            if(m==k){
                if(s==""){
                    s+=sb.substring(i-k+1,i+1);
                }else {
                    s+="-"+sb.substring(i-k+1,i+1);
                }
                m=0;
            }
        }
        return s.toUpperCase();
    }
}
