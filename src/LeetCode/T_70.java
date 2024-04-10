package LeetCode;

public class T_70 {

    public static void main(String[] args) {

    }


    public int climbStairs(int n) {
        int a = 1, b = 2 , c = 0;
        if(n == 1){
            return a;
        }
        if (n==2){
            return b;
        }
        for (int i = 2; i < n; i++) {
            c=a+b;
            a=b;
            b=c;
        }
        return c;
    }
}
