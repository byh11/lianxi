package LeetCode;

public class T_19 {

    public static void main(String[] args) {
        ListNode l=new ListNode(1);
        l.setNext(new ListNode(2));
        l.getNext().setNext(new ListNode(3));
        l.getNext().getNext().setNext(new ListNode(4));
        l.getNext().getNext().getNext().setNext(new ListNode(5));
        removeNthFromEnd(l,2);
    }

    public static ListNode removeNthFromEnd(ListNode head, int n) {
        int a=getlenght(head);
        ListNode h=new ListNode(0);
        h.setNext(head);
        n=a-n;
        ListNode x=h;
        for (int i = 0; i < n; i++) {
            x=x.getNext();
        }
        x.setNext(x.getNext().getNext());
        return h;
    }

    public static int getlenght(ListNode head){
        int a=0;
        while (head!=null){
            a++;
            head=head.getNext();
        }
        return a;
    }
}
