package LeetCode;

public class T_2 {
    public static void main(String[] args) {

    }
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode l3=new ListNode();
        ListNode t3=l3;
        while (l1!=null && l2!=null){
            t3.next=new ListNode();
            if(l1.val+l2.val>=10){
                if(l1.next!=null){
                    l1.next.val++;
                    if(l1.next.val>=10){
                        ListNode t1=l1.next;
                        while (t1.val>=10){
                            if(t1.next==null) {
                                t1.next=new ListNode();
                            }
                            t1.val=t1.val-10;
                            t1.next.val++;
                            t1=t1.next;
                        }
                    }
                }else {
                    if(l2.next==null){
                        l2.next=new ListNode();
                    }
                    l2.next.val++;
                    if(l2.next.val>=10){
                        ListNode t2=l2.next;
                        while (t2.val>=10){
                            if(t2.next==null) {
                                t2.next=new ListNode();
                            }
                            t2.val=t2.val-10;
                            t2.next.val++;
                            t2=t2.next;
                        }
                    }
                }
                t3.next.val=l1.val+l2.val-10;
            }else
            {
                t3.next.val=l1.val+l2.val;
            }
            t3=t3.next;
            l1=l1.next;
            l2=l2.next;
        }
        while (l1!=null || l2!=null){
            t3.next=new ListNode();
            if (l1!=null){
                t3.next.val=l1.val;
                t3=t3.next;
                l1=l1.next;
            }else {
                t3.next.val=l2.val;
                t3=t3.next;
                l2=l2.next;
            }
        }
        return l3.next;
    }
}
