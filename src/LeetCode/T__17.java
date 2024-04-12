package LeetCode;

import java.util.ArrayList;
import java.util.List;

public class T__17 {

    public static void main(String[] args) {
        System.out.println(letterCombinations("23"));
    }

    public static List<String> letterCombinations(String digits) {
        if(digits.length()==0){
            return new ArrayList<>();
        }
        ArrayList<String> list = new ArrayList<>();
        list.add("");
        list.add("");
        list.add("abc");
        list.add("def");
        list.add("ghi");
        list.add("jkl");
        list.add("mno");
        list.add("pqrs");
        list.add("tuv");
        list.add("wxyz");
        List s = new ArrayList<>();
        c(digits, Integer.parseInt(digits.substring(0,1)),list,new StringBuilder(),s,1);
        return s;
    }


    public static void c(String digits,int x,List<String> list,StringBuilder sb,List<String> s,int k) {
       if(digits.length()==sb.length()){
           return ;
       }
        for (int i = x; i < list.get(x).length()+x; i++) {
            sb.append(list.get(x).charAt(i-x));
            if(digits.length()>=k+1){
                c(digits,Integer.parseInt(digits.substring(k,k+1)),list,sb,s,k+1);
            }
            if (sb.length()==digits.length()){
                s.add(sb.toString());
            }
            sb.deleteCharAt(sb.length()-1);
        }
        return ;
    }
}
