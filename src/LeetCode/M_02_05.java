package LeetCode;

import java.util.ArrayList;

public class M_02_05 {

    public static void main(String[] args) {
        ListNode l1 = new ListNode(8);
        l1.next = new ListNode(9);
        l1.next.next = new ListNode(9);
        ListNode l2 = new ListNode(2);
//        l2.next = new ListNode(6);
//        l2.next.next = new ListNode(4);
        l1 = addTwoNumbers(l1, l2);
        while (l1 != null) {
            System.out.println(l1.val);
            l1 = l1.next;
        }
    }


    public static ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ArrayList<Integer> list1 = new ArrayList<>();
        ArrayList<Integer> list2 = new ArrayList<>();
        while (l1 != null) {
            list1.add(l1.val);
            l1 = l1.next;
        }
        while (l2 != null) {
            list2.add(l2.val);
            l2 = l2.next;
        }
        ArrayList<Integer> list3 = new ArrayList<>();
        while (list1.size() != 0 && list2.size() != 0) {
            int a = list1.get(0) + list2.get(0);
            if (a >= 10) {
                list3.add(a % 10);
                if (list1.size() == 1) {
                    list1.remove(0);
                    list2.remove(0);
                    list1.add(1);
                } else {
                    list1.set(1, list1.get(1) + 1);
                    list1.remove(0);
                    list2.remove(0);
                }
            } else {
                list3.add(a);
                list1.remove(0);
                list2.remove(0);
            }
        }
        if (list1.size() != 0) {
            while (list1.size() != 0) {
                list3.add(list1.get(0) % 10);
                if (list1.get(0) >= 10) {
                    if (list1.size() == 1) {
                        list1.remove(0);
                        list1.add(1);
                    } else {
                        list1.remove(0);
                        list1.set(0, list1.get(0) + 1);
                    }
                }else {
                    list1.remove(0);
                }
            }
        } else if (list2.size() != 0) {
            while (list2.size() != 0) {
                list3.add(list2.get(0) % 10);
                if (list2.get(0) >= 10) {
                    if (list2.size() == 1) {
                        list2.remove(0);
                        list2.add(1);
                    } else {
                        list2.remove(0);
                        list2.set(0, list1.get(0) + 1);
                    }
                }else {
                    list2.remove(0);
                }
            }
        }
        l1=new ListNode(list3.get(0));
        l2=l1;
        for (int i = 1; i < list3.size(); i++) {
            l2.next=new ListNode(list3.get(i));
            l2=l2.next;
        }
        return l1;
    }
}
