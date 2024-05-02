package LeetCode;

public class T_168 {

    public static void main(String[] args) {
//        int a=711/26;
//        System.out.println(a);
//        System.out.println((char)(a+64));
//        System.out.println(String.valueOf(a+65));
        System.out.println(convertToTitle(516874));
    }

    public static String convertToTitle(int columnNumber) {
        StringBuilder s=new StringBuilder();
        while (columnNumber>0){
            int a0 = (columnNumber - 1) % 26 + 1;
            s.append((char)(a0 - 1 + 'A'));
            columnNumber = (columnNumber - a0) / 26;
        }
        return s.reverse().toString();
    }
}
