package LeetCode;

public class T_1422 {
    public static int maxScore(String s) {
        int max=0;
        char[] a=s.toCharArray();
        for (int i = 1; i < a.length; i++) {
            int n=0,m=0;
            for (int j = 0; j < i; j++) {
                if(a[j]=='0'){
                    n++;
                }
            }
            for (int j = i; j <a.length ; j++) {
                if(a[j]=='1'){
                    m++;
                }
            }
            if(n+m>max){
                max=n+m;
            }
            n=0;
            m=0;
        }
        return max;
    }

    public static void main(String[] args) {
        System.out.println(maxScore("011101"));
    }
}
