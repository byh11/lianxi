package LeetCode;

public class T_1716 {

    public static void main(String[] args) {

        totalMoney(8);
    }

    public static int totalMoney(int n) {
        int sum=0;
        int week=1,day=1;
        for (int i = 0; i < n; i++) {
            sum+=week+day-1;
            if(day==7){
                week++;
                day=0;
            }
            day++;
        }
        return sum;
    }
}
