package LeetCode;

public class T_1844 {

    public static void main(String[] args) {

        replaceDigits("a1c1e1");
    }

    public static String replaceDigits(String s) {
        StringBuilder str=new StringBuilder();
        for (int i = 0; i < s.length(); i++) {
            if(i%2!=0){
                str.append(shift(s.charAt(i-1),Integer.valueOf(s.substring(i,i+1))));
            }else {
                str.append(s.charAt(i));
            }
        }
        return str.toString();
    }

    public static char shift(char c,int x){
        c= (char) (c+x);
        if(Integer.valueOf(c)>122){
            c-=26;
        }
        return c;
    }
}

