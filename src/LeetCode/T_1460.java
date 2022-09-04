package LeetCode;

import java.util.Arrays;

public class T_1460 {
    public static boolean canBeEqual(int[] target, int[] arr) {
        Arrays.sort(target);
        Arrays.sort(arr);
        for (int i = 0; i < arr.length; i++) {
            if(target[i]!=arr[i]){
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        canBeEqual(new int[]{},new int[]{});
    }
}
