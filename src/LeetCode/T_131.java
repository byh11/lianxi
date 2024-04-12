package LeetCode;

import java.util.ArrayList;
import java.util.List;

public class T_131 {

    public static void main(String[] args) {

        partition("abb");

    }

    public static List<List<String>> partition(String s) {

        List<List<String>> s1 = new ArrayList<>();

        c(s,0,new ArrayList<>(),s1,0);

        return s1;
    }

    public static void c(String s,int x,List<String> list,List<List<String>> sum,int a){
        if(x==s.length()){
            sum.add(new ArrayList<>(list));
            return;
        }
        for (int i = x; i < s.length(); i++) {
            if(a==0){
                list=new ArrayList<>();
            }
            if (Palindrome(s.substring(x,i+1))){
                list.add(s.substring(x,i+1));
            }else {
                continue;
            }
            c(s,i+1,list,sum,1);
            list.remove(list.size()-1);
        }
    }


    public static boolean Palindrome(String s) {
        if (s.charAt(0) == s.charAt(s.length() - 1)) {
            if (s.length() <= 2) {
                return true;
            }
            return Palindrome(s.substring(1, s.length() - 1));
        } else {
            return false;
        }
    }


}
