package LeetCode;

public class T_461 {

    public static void main(String[] args) {

        hammingDistance(1,4);
    }

    public static int hammingDistance(int x, int y) {
        String bx=Integer.toBinaryString(x);
        String by=Integer.toBinaryString(y);
        if(bx.length()>by.length()){
            int n=bx.length()-by.length();
            for (int i = 0; i < n; i++) {
                by='0'+by;
            }
        }else {
            int n=by.length()-bx.length();
            for (int i = 0; i < n; i++) {
                bx='0'+bx;
            }
        }
        int m=0;
        for (int i = 0; i < bx.length(); i++) {
            if(bx.charAt(i)!=by.charAt(i)){
                m++;
            }
        }
        return m;
    }
}
