package LeetCode;

/**
 * @Author °×ÔÆºÆ
 * @Date 2024/7/22 21:01
 * @×¢ÊÍ
 */

public class T_21 {

    public static void main(String[] args) {


    }

    public static ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode listNode= new ListNode();
        ListNode listNode1=listNode;
        while (list1!=null&&list2!=null){
            if(list1.val<list2.val){
                listNode1.next=list1;
                list1=list1.next;
            }else {
                listNode1.next=list2;
                list2=list2.next;
            }
            listNode1=listNode1.next;
        }
        if(list1!=null){
            listNode1.next=list1;
        }
        if (list2!=null){
            listNode1.next=list2;
        }
        return listNode.next;
    }
}
