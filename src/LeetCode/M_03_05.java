package LeetCode;

import java.util.LinkedList;

public class M_03_05 {

    public static void main(String[] args) {

    }


    class SortedStack {

        LinkedList<Integer> stack;
        public SortedStack() {
            this.stack=new LinkedList<>();
        }

        public void push(int val) {
            for (int i = 0; i < stack.size(); i++) {
                if(val<=stack.get(i)){
                    stack.add(i,val);
                    return;
                }
            }
            stack.add(val);
        }

        public void pop() {
            if(stack.size()==0)
                return;
            stack.remove(0);
        }

        public int peek() {
            if (stack.size()==0)
                return -1;
            return stack.get(0);
        }

        public boolean isEmpty() {
            return stack.isEmpty();
        }
    }
}
