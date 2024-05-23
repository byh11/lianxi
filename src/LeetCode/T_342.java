package LeetCode;

public class T_342 {

    public static void main(String[] args) {


    }

    public static boolean isPowerOfFour(int n) {
        while (n>0&&n%4==0){
            n/=4;
        }
        return n==1;
    }
}
