package LeetCode;

import java.util.ArrayList;
import java.util.Stack;

public class M_03_04 {

    public static void main(String[] args) {
        MyQueue myQueue = new MyQueue();
        myQueue.push(1);
        myQueue.push(2);
        System.out.println(myQueue.peek());
        System.out.println(myQueue.pop());
        System.out.println(myQueue.empty());
    }

    static class MyQueue {

        Stack<Integer> stack1;
        Stack<Integer> stack2;
        /** Initialize your data structure here. */
        public MyQueue() {
            this.stack1 = new Stack<>();
            this.stack2 = new Stack<>();
        }

        /** Push element x to the back of queue. */
        public void push(int x) {
            stack1.push(x);
        }

        /** Removes the element from in front of queue and returns that element. */
        public int pop() {
            for (int i = 0; i < stack1.size(); ) {
                stack2.push(stack1.pop());
            }
            int a=stack2.pop();
            for (int i = 0; i < stack2.size(); ) {
                stack1.push(stack2.pop());
            }
            return a;
        }

        /** Get the front element. */
        public int peek() {
            for (int i = 0; i < stack1.size(); ) {
                stack2.push(stack1.pop());
            }
            int a=stack2.peek();
            for (int i = 0; i < stack2.size(); ) {
                stack1.push(stack2.pop());
            }
            return a;
        }

        /** Returns whether the queue is empty. */
        public boolean empty() {
            if (stack1.size()==0 && stack2.size()==0)
                return true;
            return false;
        }

    }
}
