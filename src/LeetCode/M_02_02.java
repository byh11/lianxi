package LeetCode;

import java.util.ArrayList;

public class M_02_02 {

    public static void main(String[] args) {
        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(3);
        head.next.next.next = new ListNode(4);
        System.out.println(kthToLast(head,3));
    }

    public static int kthToLast(ListNode head, int k) {
        ArrayList<Integer> list = new ArrayList<>();
        while (head != null) {
            list.add(head.val);
            head = head.next;
        }
        return list.get(list.size() - k);
    }



}
