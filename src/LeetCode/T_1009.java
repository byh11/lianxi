package LeetCode;

public class T_1009 {

    public static void main(String[] args) {

        bitwiseComplement(5);
    }

    public static int bitwiseComplement(int n) {
        String s=Integer.toBinaryString(n);
        StringBuilder s1=new StringBuilder();
        for (int i = 0; i < s.length(); i++) {
            if(s.charAt(i)=='0'){
                s1.append('1');
            }else {
                s1.append('0');
            }
        }
        return Integer.parseInt(s1.toString(),2);
    }
}
