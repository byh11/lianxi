package LeetCode;

public class T_1309 {

    public static void main(String[] args) {

        freqAlphabets(new String("10#11#12"));
    }

    public static String freqAlphabets(String s) {
        StringBuilder res=new StringBuilder();
        for (int i = 0; i < s.length(); i++) {
            if(i+2<s.length() && s.charAt(i+2)=='#'){
                res.append(Character.toChars(Integer.valueOf(s.substring(i,i+2))+96));
                i+=2;
            }else {
                res.append(Character.toChars(Integer.valueOf(s.substring(i,i+1))+96));
            }
        }
        return res.toString();
    }
}
