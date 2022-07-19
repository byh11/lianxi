package LeetCode;

import java.util.ArrayList;
import java.util.List;

public class T_731 {
    static class MyCalendarTwo {
        List<int[]> booked;
        List<int[]> overlaps;

        public MyCalendarTwo() {
            booked = new ArrayList<int[]>();
            overlaps = new ArrayList<int[]>();
        }

        public boolean book(int start, int end) {
            for (int[] arr : overlaps) {
                int l = arr[0], r = arr[1];
                if (l < end && start < r) {
                    return false;
                }
            }
            for (int[] arr : booked) {
                int l = arr[0], r = arr[1];
                if (l < end && start < r) {
                    overlaps.add(new int[]{Math.max(l, start), Math.min(r, end)});
                }
            }
            booked.add(new int[]{start, end});
            return true;
        }
    }

    public static void main(String[] args) {
        MyCalendarTwo myCalendar=new MyCalendarTwo();
        System.out.println(myCalendar.book(10, 20)); // returns true
        System.out.println(myCalendar.book(50, 60)); // returns true
        System.out.println(myCalendar.book(10, 40)); // returns true
        System.out.println(myCalendar.book(5, 15)); // returns false
        System.out.println(myCalendar.book(5, 10)); // returns true
        System.out.println(myCalendar.book(25, 55)); // returns true
    }
}
