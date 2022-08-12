package LeetCode;

import java.util.ArrayList;

public class T_1417 {
    public static String reformat(String s) {
        ArrayList<Character> n=new ArrayList<Character>();
        ArrayList<Character> m=new ArrayList<Character>();
        char[] a=s.toCharArray();
        for (int i = 0; i < a.length; i++) {
            if(a[i]>='0' && a[i]<='9'){
                n.add(a[i]);
            }else {
                m.add(a[i]);
            }
        }
        if(Math.abs(n.size()-m.size())==1){
            char[] x=new char[s.length()];
            int l=0;
            if(n.size()>m.size()){
                for (int i = 0; i < n.size()-1; i++) {
                    x[l++]=n.get(i);
                    x[l++]=m.get(i);
                }
                x[l]=n.get(n.size()-1);
                return String.valueOf(x);
            }else {
                for (int i = 0; i < m.size()-1; i++) {
                    x[l++]=m.get(i);
                    x[l++]=n.get(i);
                }
                x[l]=m.get(m.size()-1);
                return String.valueOf(x);
            }
        } else if (Math.abs(n.size()-m.size())==0) {
            return s;
        } else {
            return "";
        }
    }

    public static void main(String[] args) {
        System.out.println(reformat("covid2019"));
    }
}
