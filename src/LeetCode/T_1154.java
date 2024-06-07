package LeetCode;

public class T_1154 {

    public static void main(String[] args) {


    }

    public static int dayOfYear(String date) {
        String[] s=date.split("-");
        int year=Integer.parseInt(s[0]);
        int month=Integer.parseInt(s[1]);
        int days=Integer.parseInt(s[2]);
        int[] monthDays = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30};
        for (int i = 0; i < month - 1; ++i) {
            days += monthDays[i];
        }
        if ((year % 400 == 0 || (year % 4 == 0 && year % 100 != 0)) && month >= 3) {
            days += 1;
        }
        return days;
    }
}
