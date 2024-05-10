package LeetCode;

public class T_2960 {

    public static void main(String[] args) {
        countTestedDevices(new int[]{1,1,2,1,3});

    }

    public static int countTestedDevices(int[] batteryPercentages) {
        int a = 0;
        for (int i = 0; i < batteryPercentages.length; i++) {
            if (batteryPercentages[i] > 0) {
                for (int j = i + 1; j < batteryPercentages.length; j++) {
                    batteryPercentages[j] = Math.max(batteryPercentages[j] - 1, 0);
                }
                a++;
            }
        }
        return a;
    }
}
