package LeetCode;

public class T_1323 {
    public static void main(String[] args) {
        maximum69Number(9969);

    }

    public static int maximum69Number (int num) {
        String s=String.valueOf(num);
        for (int i = 0; i < s.length(); i++) {
            if(s.charAt(i)=='6'){
                s=s.substring(0,i)+"9"+s.substring(i+1,s.length());
                break;
            }
        }
        return Integer.valueOf(s);
    }
}
