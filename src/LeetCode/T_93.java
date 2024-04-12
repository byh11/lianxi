package LeetCode;

import java.util.ArrayList;
import java.util.List;

public class T_93 {

    public static void main(String[] args) {
        restoreIpAddresses("0000");

    }

    public static List<String> restoreIpAddresses(String s) {

        List<String> list = new ArrayList<>();

        c(s,0,0,list,new StringBuilder());

        return list;

    }

    public static void c(String s,int x,int d,List<String> list,StringBuilder s1){
        if(s.length()-x>(4-d)*3 || x==s.length()){
            return;
        }
        if(d==3){
            if(Integer.valueOf(s.substring(x,s.length()))<=255){
                if(s.length()-x>=2 && s.charAt(x)=='0'){
                    return;
                }
                s1.append(s.substring(x,s.length()));
                list.add(String.valueOf(s1));
                for (int i = 0; i < s.length()-x; i++) {
                    s1.deleteCharAt(s1.length()-1);
                }
            }
            return;
        }
        for (int i = x; i < s.length(); i++) {
            if(d==0){
                s1=new StringBuilder();
            }
            if(i-x>=1 && s.charAt(x)=='0'){
                return;
            }
            if(Integer.valueOf(s.substring(x,i+1))<=255){
                s1.append(s.substring(x,i+1));
                s1.append(".");
            }else {
                return;
            }
            c(s,i+1,d+1,list,s1);
            if(s1!=null){
                for (int k = 0; k <(i+1-x); k++) {
                    s1.deleteCharAt(s1.length()-1);
                }
                s1.deleteCharAt(s1.length()-1);
            }

        }

    }

}
