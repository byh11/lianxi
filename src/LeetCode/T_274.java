package LeetCode;

import java.util.Arrays;

public class T_274 {

    public static void main(String[] args) {


    }

    public int hIndex(int[] citations) {
        Arrays.sort(citations);
        int h = 0, i = citations.length - 1;
        while (i >= 0 && citations[i] > h) {
            h++;
            i--;
        }
        return h;
    }
}
