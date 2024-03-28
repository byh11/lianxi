package LeetCode;

public class M_01_09 {

    public static void main(String[] args) {
        System.out.println(isFlipedString("waterbottle", "erbottlewat"));
    }

    public static boolean isFlipedString(String s1, String s2) {
        if(s1.length() != s2.length()){
            return false;
        }
        if((s1.length() == 0 && s2.length() == 0) || s1.equals(s2)){
            return true;
        }
        for (int i = 0; i < s1.length(); i++) {
            String s = s1.substring(i, s1.length()) + s1.substring(0, i);
            if(s.equals(s2)){
                return true;
            }
        }
        return false;
    }
}
