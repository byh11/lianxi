package LeetCode;

import java.util.ArrayList;

public class T_641 {
    class MyCircularDeque {
        int size;
        int[] array;

        int head=0;
        int tail=0;
        public MyCircularDeque(int k) {
            this.size=k+1;
            array=new int[k+1];
        }

        public boolean insertFront(int value) {
            if(isFull()){
                return false;
            }
            head = (head - 1 + size) % size;
            array[head] = value;
            return true;
        }

        public boolean insertLast(int value) {
            if(isFull()){
                return false;
            }
            array[tail] = value;
            tail=(tail+1)%size;
            return true;
        }

        public boolean deleteFront() {
            if(isEmpty()){
                return false;
            }
            head=(head+1)%size;
            return true;
        }

        public boolean deleteLast() {
            if(isEmpty()){
                return false;
            }
            tail=(tail-1+size)%size;
            return true;
        }

        public int getFront() {
            if(isEmpty()){
                return -1;
            }
            return array[head];
        }

        public int getRear() {
            if(isEmpty()){
                return -1;
            }
            return array[(tail-1+size)%size];
        }

        public boolean isEmpty() {
            return head==tail;
        }

        public boolean isFull() {
            return (tail+1)%size==head;
        }
    }

    public static void main(String[] args) {

    }
}
