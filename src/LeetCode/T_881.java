package LeetCode;


import java.util.Arrays;

public class T_881 {
    public static void main(String[] args) {

    }

    public static int numRescueBoats(int[] people, int limit) {
        Arrays.sort(people);
        int l = 0, r = people.length - 1;
        int a = 0;
        while (l <= r) {
            if (people[l] + people[r] <= limit) {
                a++;
                l++;
                r--;
            } else {
                a++;
                r--;
            }
        }
        return a;
    }
}