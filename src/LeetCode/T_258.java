package LeetCode;

public class T_258 {

    public static void main(String[] args) {


    }

    public static int addDigits(int num) {
        while (String.valueOf(num).length()!=1){
            int x=0;
            String str=String.valueOf(num);
            for (int i = 0; i < str.length(); i++) {
                x+=Integer.parseInt(String.valueOf(str.charAt(i)));
            }
            num=x;
        }
        return num;
    }
}
