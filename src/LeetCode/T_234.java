package LeetCode;

public class T_234 {

    public static void main(String[] args) {


    }

    public static boolean isPalindrome(ListNode head) {
        StringBuilder s=new StringBuilder();
        while (head!=null){
            s.append(head.val);
            head=head.next;
        }
        return Palindrome(s.toString());
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
