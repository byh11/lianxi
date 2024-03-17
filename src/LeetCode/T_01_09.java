package LeetCode;

public class T_01_09 {
    public static boolean isFlipedString(String s1, String s2) {
        if (s1.length() != s2.length()) {
            return false;
        }
        int n=s2.length();
        for (int i = 0; i < n; i++) {
            boolean flag = true;
            for (int j = 0; j < n; j++) {
                if (s1.charAt((i + j) % n) != s2.charAt(j)) {
                    flag = false;
                    break;
                }
            }
        }
        return true;
    }
    public static void main(String[] args) {
        System.out.println(isFlipedString("waterbottle","erbottlewat"));
    }
}
