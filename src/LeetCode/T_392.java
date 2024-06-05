package LeetCode;

public class T_392 {

    public static void main(String[] args) {


    }

    public static boolean isSubsequence(String s, String t) {
        int x=0;
        for (int i = 0; i < t.length(); i++) {
            if(s.charAt(x)==t.charAt(i)){
                x++;
            }
            if(x==s.length()){
                break;
            }
        }
        if(x==s.length()){
            return true;
        }
        return false;
    }
}
