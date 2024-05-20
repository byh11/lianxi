package LeetCode;

public class T_796 {

    public static void main(String[] args) {

        rotateString("abcde","bcdea");
    }

    public static boolean rotateString(String s, String goal) {
        String a=s;
        while (true){
            if(s.equals(goal)){
                return true;
            }
            s=s.substring(1,s.length())+s.substring(0,1);
            if(s.equals(a)){
                break;
            }
        }
        return false;
    }
}
