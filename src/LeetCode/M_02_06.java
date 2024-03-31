package LeetCode;

import java.util.ArrayList;

public class M_02_06 {

    public static void main(String[] args) {

        ListNode head = new ListNode(-129);
        head.setNext(new ListNode(-129));
//        head.getNext().setNext(new ListNode(3));
//        head.getNext().getNext().setNext(new ListNode(2));
//        head.getNext().getNext().getNext().setNext(new ListNode(1));
        System.out.println(isPalindrome(head));

    }


    public static boolean isPalindrome(ListNode head) {
        ArrayList<Integer> list = new ArrayList<>();
        while (head != null) {
            list.add(head.val);
            head = head.next;
        }
        for (int i = 0; i < list.size() / 2; i++) {
            int a=list.get(i);
            int b=list.get(list.size() - 1 - i);

            if (a != b) {
                return false;
            }
        }
        return true;
    }
}
