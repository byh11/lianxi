package LeetCode;

public class T_66 {

    public static void main(String[] args) {

        plusOne(new int[]{1,2,3,4});
    }

    public static int[] plusOne(int[] digits) {
        String str = "";
        for (int i = 0; i < digits.length; i++) {
            str+=digits[i];
        }
        Integer n = Integer.valueOf(str);
        n++;
        String s=n.toString();
        int[] res = new int[s.length()];
        for (int i = 0; i < s.length(); i++) {
           res[i]=Integer.valueOf(s.substring(i,i+1));
        }
        return res;
    }
}
