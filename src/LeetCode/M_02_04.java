package LeetCode;

public class M_02_04 {

    public static void main(String[] args) {
        ListNode node = new ListNode(1);
        node.next = new ListNode(4);
        node.next.next = new ListNode(3);
        node.next.next.next = new ListNode(2);
        node.next.next.next.next = new ListNode(5);
        node.next.next.next.next.next = new ListNode(2);
        node=partition(node, 3);
        while (node!=null){
            System.out.println(node.val);
            node=node.next;
        }
    }

    public static ListNode partition(ListNode head, int x) {
        ListNode s=new ListNode(0);
        ListNode s1=s;
        ListNode m=new ListNode(0);
        ListNode m1=m;
        while (head!=null){
            if(head.val<x){
                s1.next=head;
                s1=s1.next;
            }else {
                m1.next=head;
                m1=m1.next;
            }
            head=head.next;
        }
        m1.next=null;
        s1.next=m.next;
        return s.next;
    }
}
