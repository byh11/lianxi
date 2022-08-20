package LeetCode;

import java.util.ArrayList;

public class T_729 {
    class MyCalendar {
        ArrayList<Integer> list;
        public MyCalendar() {
            list=new ArrayList<>();
        }

        public boolean book(int start, int end) {
            for (int i = 0; i < list.size(); i+=2) {
                if(list.get(i)<end && list.get(i+1)>start){
                    return false;
                }
            }
            list.add(start);
            list.add(end);
            return true;
        }
    }

    public static void main(String[] args) {

    }
}
