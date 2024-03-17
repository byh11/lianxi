package LeetCode;

import java.util.HashMap;

public class T_83 {
    public static ListNode deleteDuplicates(ListNode head) {
        if(head==null){
            return null;
        }
        HashMap<Integer,Integer> map=new HashMap<>();
        ListNode node=head;
        map.put(node.val,1);
        while (node.next!=null){
            if((map.get(node.next.val)!=null)){
                node.next=node.next.next;
                continue;
            }else {
                map.put(node.next.val,1);
            }
            node=node.next;
        }
        return head;
    }

    public static void main(String[] args) {
        ListNode node=new ListNode(1);
        node.next=new ListNode(1);
        node.next.next=new ListNode(2);
        node.next.next.next=new ListNode(2);
        deleteDuplicates(node);
        while (node!=null){
            System.out.println(node.val);
            node=node.next;
        }
    }
}
