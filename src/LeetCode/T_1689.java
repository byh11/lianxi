package LeetCode;

public class T_1689 {

    public static void main(String[] args) {


    }

    public int minPartitions(String n) {
        char c='0';
        for (int i = 0; i < n.length(); i++) {
            if(n.charAt(i)>c){
                c=n.charAt(i);
            }
        }
        return Integer.valueOf(String.valueOf(c));
    }
}
