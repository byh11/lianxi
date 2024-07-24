package LeetCode;

/**
 * @Author °×ÔÆºÆ
 * @Date 2024/7/23 21:45
 * @×¢ÊÍ
 */

public class T_61 {

    public static void main(String[] args) {
        ListNode listNode=new ListNode(1);
        listNode.next=new ListNode(2);
        listNode.next.next=new ListNode(3);
        listNode.next.next.next=new ListNode(4);
        listNode.next.next.next.next=new ListNode(5);
        rotateRight(listNode,2);

    }

    public static ListNode rotateRight(ListNode head, int k) {
        if (k == 0 || head == null || head.next == null) {
            return head;
        }
        ListNode listNode=new ListNode();
        listNode.next=head;
        ListNode listNode1=listNode;
        int count=0;
        while (listNode1.next!=null){
            count++;
            listNode1=listNode1.next;
        }
        k=count-(k%count);
        listNode1=listNode;
        for (int i = 0; i < k; i++) {
            listNode1=listNode1.next;
        }
        ListNode listNode2=listNode.next;
        listNode.next=listNode1.next;
        listNode1.next=null;
        ListNode listNode3=listNode;
        while (listNode3.next!=null){
            listNode3=listNode3.next;
        }
        listNode3.next=listNode2;
        return listNode.next;
    }
}
