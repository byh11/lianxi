package LeetCode;

import java.util.ArrayList;

public class M_01_01 {


    public static void main(String[] args) {
        System.out.println(isUnique("abcd"));
    }

    public static boolean isUnique(String astr) {
        for (int i = 0; i < astr.length(); i++) {
            for (int j = i+1; j < astr.length(); j++) {
                if(astr.charAt(i) == astr.charAt(j)){
                    return false;
                }
            }
        }
        return true;
    }
}
