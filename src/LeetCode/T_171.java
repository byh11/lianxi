package LeetCode;

public class T_171 {

    public static void main(String[] args) {
        System.out.println(titleToNumber("ACJOT"));

    }

    public static int titleToNumber(String columnTitle) {
        int x=1;
        int sum=(Integer.valueOf(columnTitle.charAt(columnTitle.length()-1))-64);
        for (int i = columnTitle.length()-2; i >=0 ; i--) {
            sum+=(Integer.valueOf(columnTitle.charAt(i))-64)*a(x++);
        }
        return sum;
    }

    public static int a(int x){
        int s=1;
        for (int i = 0; i < x; i++) {
            s=s*26;
        }
        return s;
    }
}
