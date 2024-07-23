package LeetCode;

/**
 * @Author °×ÔÆºÆ
 * @Date 2024/7/23 21:42
 * @×¢ÊÍ
 */

public class T_24 {

    public static void main(String[] args) {


    }

    public static ListNode swapPairs(ListNode head) {
        ListNode list=new ListNode();
        list.next=head;
        ListNode listNode=list;
        while (listNode.next!=null&&listNode.next.next!=null){
            ListNode node1=listNode.next;
            ListNode node2=listNode.next.next;
            node1.next=node2.next;
            node2.next=node1;
            listNode.next=node2;
            listNode=node1;
        }
        return list.next;
    }
}
