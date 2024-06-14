package LeetCode;

import java.util.Arrays;

public class T_2491 {

    public static void main(String[] args) {


    }

    public static long dividePlayers(int[] skill) {
        long s=0;
        Arrays.sort(skill);
        int x=skill[0]+skill[skill.length-1];
        for (int i = 0; i < skill.length/2; i++) {
            if(skill[i]+skill[skill.length-i-1]!=x){
                return -1;
            }else {
                s+=(skill[i]*skill[skill.length-i-1]);
            }
        }
        return s;
    }
}
