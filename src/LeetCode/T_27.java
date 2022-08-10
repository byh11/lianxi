package LeetCode;

import java.util.ArrayList;
import java.util.HashMap;

public class T_27 {
    public static boolean isPalindrome(ListNode head) {
        ListNode listNode=head;
        int a=0;
        while (listNode!=null){
            a++;
            listNode=listNode.next;
        }
        int l=a;
        a=a/2;
        listNode=head;
        int x=0;
        ArrayList<Integer> list=new ArrayList<>();
        while (listNode!=null){
            if(a>0){
                list.add(x++,listNode.val);
                a--;
            }else if(a==0){
                if(l%2==0){
                    x--;
                    if(list.get(x)==listNode.val) {
                        list.remove(x--);
                    }
                }else {
                    x--;
                }
                a--;
            }else {
                if(list.get(x)==listNode.val) {
                    list.remove(x--);
                }
            }
            listNode=listNode.next;
        }
        if(list.size()==0){
            return true;
        }else {
            return false;
        }
    }

    public static void main(String[] args) {
        ListNode node=new ListNode(1);
        node.next=new ListNode(2);
        node.next.next=new ListNode(3);
        node.next.next.next=new ListNode(2);
        node.next.next.next.next=new ListNode(1);
        System.out.println(isPalindrome(node));
    }
}
