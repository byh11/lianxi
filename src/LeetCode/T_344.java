package LeetCode;

public class T_344 {

    public static void main(String[] args) {


    }

    public static void reverseString(char[] s) {
        for (int i = 0; i < s.length/2; i++) {
            char t=s[i];
            s[i]=s[s.length-1-i];
            s[s.length-1-i]=t;
        }
    }
}
