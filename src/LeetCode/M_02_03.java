package LeetCode;

public class M_02_03 {

    public static void main(String[] args) {
//        ListNode head = new ListNode(1);
//        head.next = new ListNode(2);
//        head.next.next = new ListNode(3);
//        head.next.next.next = new ListNode(4);
//        deleteNode(head);
//        byte b=(byte)(3+128);
        byte b1=3;
        byte b2=4;
        byte b= (byte) (b1+b2);
        System.out.println(b);
    }

    public static void deleteNode(ListNode node) {
        node.val = node.next.val;
        node.next = node.next.next;
    }
}
