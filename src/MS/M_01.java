package MS;

import LeetCode.ListNode;

public class M_01 {

    public static void main(String[] args) {
        ListNode listNode=new ListNode(4);
        listNode.setNext(new ListNode(2));
        listNode.getNext().setNext(new ListNode(3));
        listNode.getNext().getNext().setNext(new ListNode(1));

        ListNode head=new ListNode();
        head.setNext(listNode);
        while (head.getNext().getNext()!=null){
            if(head.getNext().getVal()>head.getNext().getNext().getVal()){
                ListNode t=head.getNext().getNext();
                head.setNext(head.getNext().getNext().getNext());
                t.setNext(head.getNext());
                head.setNext(t);
            }
            head=head.getNext();
        }
        while (head.getNext()!=null){
            System.out.println(head.getNext().getVal());
            head= head.getNext();
        }
    }
}
