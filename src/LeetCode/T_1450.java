package LeetCode;

public class T_1450 {
    public static int busyStudent(int[] startTime, int[] endTime, int queryTime) {
        int a=0;
        for (int i = 0; i < startTime.length; i++) {
            if (queryTime>=startTime[i]&&queryTime<=endTime[i]){
                a++;
            }
        }
        return a;
    }

    public static void main(String[] args) {
        System.out.println(busyStudent(new int[]{1,2,3},new int[]{3,2,7},4));
    }
}
