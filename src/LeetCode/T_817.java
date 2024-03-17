package LeetCode;

import java.util.HashSet;
import java.util.Set;

public class T_817 {
    public static int numComponents(ListNode head, int[] nums) {
        int n=0;
        Set<Integer> set=new HashSet<>();
        for (int i = 0; i < nums.length; i++) {
            set.add(nums[i]);
        }
        boolean inSet = false;
        while (head != null) {
            if (set.contains(head.val)) {
                if (!inSet) {
                    inSet = true;
                    n++;
                }
            } else {
                inSet = false;
            }
            head = head.next;
        }
        return n;
    }

    public static void main(String[] args) {
        ListNode node=new ListNode(0);
        node.next=new ListNode(1);
        node.next.next=new ListNode(2);
        node.next.next.next=new ListNode(3);
        System.out.println(numComponents(node,new int[]{0,1,3}));
    }
}
