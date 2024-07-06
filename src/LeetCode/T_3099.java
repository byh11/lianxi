package LeetCode;

public class T_3099 {
    public static void main(String[] args) {

        sumOfTheDigitsOfHarshadNumber(18);
    }

    public static int sumOfTheDigitsOfHarshadNumber(int x) {
        String s = String.valueOf(x);
        int a = 0;
        for (int i = 0; i < s.length(); i++) {
            int n = Integer.valueOf(String.valueOf(s.charAt(i)));
            a += n;
        }
        if (x % a != 0) {
            return -1;
        }
        return a;
    }
}
