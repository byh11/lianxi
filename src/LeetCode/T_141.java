package LeetCode;

import java.util.HashMap;

public class T_141 {

    public static void main(String[] args) {


    }

    public static boolean hasCycle(ListNode head) {
        HashMap<ListNode,Integer> map = new HashMap<>();
        while(head!=null){
            if(map.containsKey(head)){
                return true;
            }
            map.put(head,1);
            head = head.next;
        }
        return false;
    }
}
