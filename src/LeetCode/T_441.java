package LeetCode;

public class T_441 {
    public static void main(String[] args) {
        System.out.println(arrangeCoins(6));
    }
    public static int arrangeCoins(int n) {
        int a=0;
        int i=1;
        while (n>0){
            n-=i;
            i++;
            if(n<0)
                break;
            a++;
        }
        return a;
    }
}
