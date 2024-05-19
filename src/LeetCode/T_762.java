package LeetCode;

public class T_762 {

    public static void main(String[] args) {
        countPrimeSetBits(6,10);

    }

    public static int countPrimeSetBits(int left, int right) {
        int sum=0;
        for (int i = left; i <= right; i++) {
            String s=Integer.toBinaryString(i);
            int x=0;
            for (int j = 0; j < s.length(); j++) {
                if(s.charAt(j)=='1'){
                    x++;
                }
            }
            if(x<=1){
                continue;
            }
            int n=0;
            for (int j = 2; j < x; j++) {
                if(x%j==0){
                    n++;
                    break;
                }
            }
            if(n==0){
                sum++;
            }
        }
        return sum;
    }
}
