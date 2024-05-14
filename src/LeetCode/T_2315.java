package LeetCode;

public class T_2315 {

    public static void main(String[] args) {


    }

    public static int countAsterisks(String s) {
        int count = 0;
        int x=0;
        for (int i = 0; i < s.length(); i++) {
            if(s.charAt(i)=='|'){
                if(x==0){
                    x++;
                }else {
                    x--;
                }
            }
            if (x==0 && s.charAt(i)=='*'){
                count++;
            }
        }

        return count;
    }
}
