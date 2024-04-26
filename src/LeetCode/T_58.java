package LeetCode;

public class T_58 {

    public static void main(String[] args) {


    }

    public static int lengthOfLastWord(String s) {
        String[] str = s.split(" ");
        return str[str.length-1].length();
    }
}
