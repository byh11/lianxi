package LeetCode;

public class T_387 {

    public static void main(String[] args) {


    }

    public static int firstUniqChar(String s) {
        for (int i = 0; i < s.length(); i++) {
            char c=s.charAt(i);
            boolean b=true;
            for (int j = 0; j < s.length(); j++) {
                if(i==j){
                    continue;
                }
                if(c==s.charAt(j)){
                    b=false;
                    break;
                }
            }
            if(b){
                return i;
            }
        }
        return -1;
    }
}
