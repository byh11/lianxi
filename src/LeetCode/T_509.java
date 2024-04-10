package LeetCode;

public class T_509 {

    public static void main(String[] args) {
        fib(3);
    }

    public static int fib(int n) {
        int a=1,b=1,c=0;
        if(n==0){
            return 0;
        }
        if(n<=2){
            return 1;
        }
        for (int i = 2; i < n; i++) {
            c=a+b;
            a=b;
            b=c;
        }
        return c;
    }

}
