package LeetCode;

public class T_3019 {

    public static void main(String[] args) {


    }

    public int countKeyChanges(String s) {
        s=s.toLowerCase();
        int n=0;
        for (int i = 1; i < s.length(); i++) {
            if(s.charAt(i-1)!=s.charAt(i)){
                n++;
            }
        }
        return n;
    }
}
