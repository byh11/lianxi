package LeetCode;

public class M_01_03 {

    public static void main(String[] args) {
        System.out.println(replaceSpaces("We are happy.", 13));
    }

    public static String replaceSpaces(String S, int length) {
        StringBuilder s = new StringBuilder();
        for (int i = 0; i < length; i++) {
            if (S.charAt(i) == ' '){
                s.append("%20");
            }else {
                s.append(S.charAt(i));
            }
        }
        return s.toString();
    }
}
