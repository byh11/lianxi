package LeetCode;

public class T_3184 {

    public static void main(String[] args) {


    }

    public static int countCompleteDayPairs(int[] hours) {
        int n=0;
        for (int i = 0; i < hours.length; i++) {
            for (int j = i+1; j < hours.length; j++) {
                if((hours[i]+hours[j])%24==0){
                    n++;
                }
            }
        }
        return n;

    }
}
