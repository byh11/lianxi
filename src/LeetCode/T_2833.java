package LeetCode;

public class T_2833 {
    public static void main(String[] args) {

        furthestDistanceFromOrigin("L_RL__R");
    }

    public static int furthestDistanceFromOrigin(String moves) {
        int[] arr = new int[3];
        int len = moves.length();
        for(int i = 0; i < len; i++){
            if('L' == moves.charAt(i)){
                arr[0]++;
            } else if ('R' == moves.charAt(i)){
                arr[2]++;
            } else {
                arr[1]++;
            }
        }
        return Math.abs(arr[2] - arr[0]) + arr[1];
    }
}
