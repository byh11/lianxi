package LeetCode;

public class M_02_07 {

    public static void main(String[] args) {
        ListNode node1=new ListNode(4);
        node1.next=new ListNode(1);
        node1.next.next=new ListNode(8);
        node1.next.next.next=new ListNode(4);
        node1.next.next.next.next=new ListNode(5);
        ListNode node2=new ListNode(5);
        node2.next=new ListNode(0);
        node2.next.next=new ListNode(1);
        node2.next.next.next=new ListNode(8);
        node2.next.next.next.next=new ListNode(4);
        node2.next.next.next.next.next=new ListNode(5);
        System.out.println(getIntersectionNode(node1,node2).getVal());
    }

    public static ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        while (headB!=null){
            ListNode node=headA;
            ListNode node2=headB;
            while(node!=null){
                if(node.val == node2.val){
                    if(node2.next==null && node.next==null){
                        node2=node2.next;
                        node=node.next;
                    } else if ((node2.next!=null && node.next==null)||(node2.next==null && node.next!=null)) {
                        break;
                    } else {
                        return node;
                    }
                }else {
                    node=node.next;
                }
            }
            headB=headB.next;
        }
        return null;
    }
}
