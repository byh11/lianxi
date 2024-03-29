package LeetCode;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedHashSet;

public class M_02_01 {
    public static void main(String[] args) {
        ListNode listNode = new ListNode(51);
        listNode.next = new ListNode(24);
        listNode.next.next = new ListNode(33);
        listNode.next.next.next = new ListNode(33);
        listNode.next.next.next.next = new ListNode(46);
        listNode.next.next.next.next.next = new ListNode(46);
        listNode = removeDuplicateNodes(listNode);
        while (listNode!=null){
            System.out.println(listNode.val);
            listNode = listNode.next;
        }
    }

    public static ListNode removeDuplicateNodes(ListNode head) {
        if (head == null) {
            return null;
        }
        LinkedHashSet<Integer> set = new LinkedHashSet<>();
        while (head != null) {
            if (set.contains(head.val)) {
                head = head.next;
            } else {
                set.add(head.val);
                head = head.next;
            }
        }
        ArrayList<Integer> list = new ArrayList<>(set);
        head=new ListNode(list.get(0));
        ListNode temp = head;
        for (int i = 1; i < list.size(); i++) {
            temp.next = new ListNode(list.get(i));
            temp = temp.next;
        }
        return head;
    }


}
