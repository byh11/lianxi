package LeetCode;

public class LCP_61 {

    public static void main(String[] args) {

        temperatureTrend(new int[]{21,18,18,18,31},new int[]{34,32,16,16,17});
    }


    public static int temperatureTrend(int[] temperatureA, int[] temperatureB) {
        int max = 0;
        int n = 0;
        for (int i = 1; i < temperatureA.length; i++) {
            if (temperatureA[i] > temperatureA[i - 1] && temperatureB[i] > temperatureB[i - 1] ||
                    temperatureA[i] < temperatureA[i - 1] && temperatureB[i] < temperatureB[i - 1] ||
                    temperatureA[i] == temperatureA[i - 1] && temperatureB[i] == temperatureB[i - 1]) {
                n++;
            } else {
                max = Math.max(max, n);
                n = 0;
            }
        }
        max = Math.max(max, n);
        return max;
    }
}
