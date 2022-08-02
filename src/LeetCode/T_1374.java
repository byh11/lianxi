package LeetCode;

public class T_1374 {
    public static void main(String[] args) {
        System.out.println(generateTheString(6));
    }

    public static String generateTheString(int n) {
        String a="";
        char c='a';
        if(n%2!=0){
            for (int i = 0; i < n; i++) {
                a += c;
            }
        }else {
            for (int i = 1; i < n; i++) {
                a += c;
            }
            a+='p';
        }

        return a;
    }
}
