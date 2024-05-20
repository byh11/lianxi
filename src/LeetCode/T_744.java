package LeetCode;

import java.util.Arrays;

public class T_744 {

    public static void main(String[] args) {

        nextGreatestLetter(new char[]{'c','f','g'},'a');
    }

    public static char nextGreatestLetter(char[] letters, char target) {
        int[] a=new int[letters.length];
        for (int i = 0; i < letters.length; i++) {
            a[i]=Integer.valueOf(letters[i]);
        }
        int x=Integer.valueOf(target);
        Arrays.sort(a);
        for (int i = 0; i < a.length; i++) {
            if(a[i]>target){
                return (char) a[i];
            }
        }
        return letters[0];
    }
}
