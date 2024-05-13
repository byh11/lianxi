package LeetCode;

public class T_191 {

    public static void main(String[] args) {


    }

    public static int hammingWeight(int n) {
        int s=0;
        String a=Integer.toBinaryString(n);
        for (int i = 0; i < a.length(); i++) {
            if(a.charAt(i)=='1'){
                s++;
            }
        }
        return s;
    }
}
