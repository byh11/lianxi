package LeetCode;

public class T_9 {

    public static void main(String[] args) {

    }


    public boolean isPalindrome(int x) {
        return Palindrome(String.valueOf(x));
    }

    public static boolean Palindrome(String s) {
        if (s.charAt(0) == s.charAt(s.length() - 1)) {
            if (s.length() <= 2) {
                return true;
            }
            return Palindrome(s.substring(1, s.length() - 1));
        } else {
            return false;
        }
    }
}
