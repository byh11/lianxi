package LeetCode;

public class T_844 {

    public static void main(String[] args) {

    }


    public static boolean backspaceCompare(String s, String t) {
        StringBuilder s1 = new StringBuilder();
        StringBuilder s2 = new StringBuilder();
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '#') {
                if (s1.length() != 0) {
                    s1.deleteCharAt(s1.length() - 1);
                }
            } else {
                s1.append(s.charAt(i));
            }
        }
        for (int i = 0; i < t.length(); i++) {
            if (t.charAt(i) == '#') {
                if (s2.length() != 0) {
                    s2.deleteCharAt(s2.length() - 1);
                }
            } else {
                s2.append(t.charAt(i));
            }
        }
        return s1.toString().equals(s2.toString());
    }
}
