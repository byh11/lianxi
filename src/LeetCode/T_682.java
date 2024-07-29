package LeetCode;

import java.util.ArrayList;

/**
 * @Author °×ÔÆºÆ
 * @Date 2024/7/29 21:40
 * @×¢ÊÍ
 */

public class T_682 {

    public static void main(String[] args) {


    }

    public static int calPoints(String[] operations) {
        int a=0;
        ArrayList<Integer> pre=new ArrayList<>();
        for (int i = 0; i < operations.length; i++) {
            if(operations[i].equals("+")){
                a+=pre.get(pre.size()-2)+pre.get(pre.size()-1);
                pre.add(pre.get(pre.size()-2)+pre.get(pre.size()-1));
            }else if(operations[i].equals("D")){
                a+=pre.get(pre.size()-1)*2;
                pre.add(pre.get(pre.size()-1)*2);
            }else if(operations[i].equals("C")){
                a-=pre.get(pre.size()-1);
                pre.remove(pre.size()-1);
            }else {
                a+=Integer.valueOf(operations[i]);
                pre.add(Integer.valueOf(operations[i]));
            }
        }
        return a;
    }
}
