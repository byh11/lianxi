package LeetCode;

public class M_01_06 {

    public static void main(String[] args) {
        System.out.println(compressString(""));
    }

    public static String compressString(String S) {
        if(S.length() == 0){
            return S;
        }
        StringBuilder s = new StringBuilder();
        int n=1;
        char c = S.charAt(0);
        for (int i = 1; i < S.length(); i++) {
            if(c == S.charAt(i)){
                n++;
            }else{
                s.append(c);
                s.append(n);
                c = S.charAt(i);
                n = 1;
            }
        }
        s.append(c);
        s.append(n);
        if(s.length() >= S.length()){
            return S;
        }
        return s.toString();
    }
}
