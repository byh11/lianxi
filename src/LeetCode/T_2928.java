package LeetCode;

public class T_2928 {
    public static void main(String[] args) {


    }

    public static int distributeCandies(int n, int limit) {
        int x=0;
        for (int i = 0; i <= limit; i++) {
            for (int j = 0; j <= limit; j++) {
                if(i+j>n)
                    break;
                if(n-i-j<=n)
                    x++;
            }
        }
        return x;
    }
}
