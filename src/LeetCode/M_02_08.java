package LeetCode;

import java.util.HashMap;

public class M_02_08 {

    public static void main(String[] args) {
        ListNode node=new ListNode(1);
        detectCycle(node);
    }

    public static ListNode detectCycle(ListNode head) {
        HashMap<ListNode,Integer> map = new HashMap<>();
        while (head!=null){
            if(!map.containsKey(head)){
                map.put(head,1);
                head=head.next;
            }else {
                return head;
            }
        }
        return null;
    }
}
