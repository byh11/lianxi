package LeetCode;

public class T_2119 {
    public static void main(String[] args) {
        System.out.println(isSameAfterReversals(519));
    }

    public static boolean isSameAfterReversals(int num) {
        String s=String.valueOf(num);
        char[] c=s.toCharArray();
        for (int i = 0; i < c.length/2; i++) {
            char a=c[i];
            c[i]=c[c.length-1-i];
            c[c.length-1-i]=a;
        }
        int b=Integer.valueOf(String.valueOf(c));
        c=String.valueOf(b).toCharArray();
        for (int i = 0; i < c.length/2; i++) {
            char a=c[i];
            c[i]=c[c.length-1-i];
            c[c.length-1-i]=a;
        }
        b=Integer.valueOf(String.valueOf(c));
        if(b==num){
            return true;
        }
        return false;
    }
}
