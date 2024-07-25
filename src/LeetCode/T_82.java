package LeetCode;

import java.util.HashMap;

/**
 * @Author °×ÔÆºÆ
 * @Date 2024/7/25 11:53
 * @×¢ÊÍ
 */

public class T_82 {

    public static void main(String[] args) {

        ListNode node=new ListNode(1);
        node.next=new ListNode(1);
//        node.next.next=new ListNode(1);
//        node.next.next.next=new ListNode(2);
//        node.next.next.next.next=new ListNode(3);
        deleteDuplicates(node);
    }

    public static ListNode deleteDuplicates(ListNode head) {
        if(head==null||head.next==null){
            return head;
        }
        ListNode listNode=new ListNode();
        listNode.next=head;
        ListNode node=listNode;
        HashMap<Integer,Boolean> map=new HashMap<>();
        while (node.next!=null&&node.next.next!=null){
            if(map.containsKey(node.next.val)){
                node.next=node.next.next;
                continue;
            }
            if(node.next.val==node.next.next.val){
                map.put(node.next.val,true);
                node.next=node.next.next.next;
                continue;
            }
            node=node.next;
        }
        if(node.next!=null&&map.containsKey(node.next.val)){
            node.next=node.next.next;
        }
        return listNode.next;
    }
}
