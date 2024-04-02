package LeetCode;

import java.util.ArrayList;
import java.util.HashMap;

public class M_03_02 {

    public static void main(String[] args) {

    }


    class MinStack {

        int size;
        ArrayList<Integer> list;
        ArrayList<Integer> minList;

        /** initialize your data structure here. */
        public MinStack() {
           this.size = 0;
           this.list = new ArrayList<>();
           this.minList = new ArrayList<>();
           minList.add(Integer.MAX_VALUE);
        }

        public void push(int x) {
            list.add(x);
            size++;
            if(x<minList.get(minList.size()-1)){
                minList.add(x);
            }else {
                minList.add(minList.get(minList.size()-1));
            }
        }

        public void pop() {
            list.remove(--size);
            minList.remove(minList.size()-1);
        }

        public int top() {
            return list.get(size-1);
        }

        public int getMin() {
            return minList.get(minList.size()-1);
        }
    }
}
