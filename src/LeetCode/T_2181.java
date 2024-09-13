package LeetCode;

/**
 * @Author 白云浩
 * @Date 2024/9/9 22:13
 * @注释
 */

public class T_2181 {

    public static void main(String[] args) {
        ListNode node = new ListNode(0);
        node.next = new ListNode(3);
        node.next.next = new ListNode(1);
        node.next.next.next = new ListNode(0);
        node.next.next.next.next = new ListNode(4);
        node.next.next.next.next.next = new ListNode(5);
        node.next.next.next.next.next.next = new ListNode(2);
        node.next.next.next.next.next.next.next = new ListNode(0);
        mergeNodes(node);
    }

    public static ListNode mergeNodes(ListNode head) {
        ListNode node = new ListNode();
        ListNode n = node;
        int x = 0;
        while (head != null) {
            if (head.val == 0 && x != 0) {
                n.next = new ListNode(x);
                n = n.next;
                x = 0;
            } else if (head.val != 0) {
                x += head.val;
            }
            head = head.next;
        }
        return node.next;
    }
}
