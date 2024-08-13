package LeetCode;

public class T_66 {

    public static void main(String[] args) {

        plusOne(new int[]{1,2,3,4});
    }

    public static int[] plusOne(int[] digits) {
        boolean b = false;
        for (int i = digits.length - 1; i >= 0; i--) {
            if (digits[i] == 9) {
                digits[i] = 0;
            } else {
                digits[i] += 1;
                if (digits[i] == 10)
                    continue;
                return digits;
            }
        }
        int[] n = new int[digits.length + 1];
        n[0] = 1;
        return n;
    }
}
