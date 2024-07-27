package LeetCode;

/**
 * @Author °×ÔÆºÆ
 * @Date 2024/7/26 15:27
 * @×¢ÊÍ
 */

public class T_206 {

    public static void main(String[] args) {

        ListNode node = new ListNode(1);
        node.next=new ListNode(2);
        node.next.next=new ListNode(3);
        reverseList(node);
    }

    public static ListNode reverseList(ListNode head) {
        ListNode node = new ListNode();
        ListNode next = null;
        while (head != null) {
            next=head;
            head=head.next;
            next.next=node.next;
            node.next=next;
        }
        return node.next;
    }
}
