package LeetCode;

public class T_1732 {

    public static void main(String[] args) {


    }

    public int largestAltitude(int[] gain) {
        int n=0;
        int max=0;
        for (int i = 0; i < gain.length; i++) {
            n+=gain[i];
            if(n>max){
                max=n;
            }
        }
        return max;
    }
}
