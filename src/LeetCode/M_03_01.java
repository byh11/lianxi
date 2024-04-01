package LeetCode;

import java.util.ArrayList;

public class M_03_01 {

    public static void main(String[] args) {

    }

    class TripleInOne {

        int stackSize;
        int[][] data;
        int a=0,b=0,c=0;
        public TripleInOne(int stackSize) {
            this.stackSize = stackSize;
            this.data=new int[3][stackSize];
        }

        public void push(int stackNum, int value) {
            switch (stackNum){
                case 0:
                    if(a<stackSize){
                        data[0][a++]=value;
                    }
                    break;
                case 1:
                    if(b<stackSize){
                        data[1][b++]=value;
                    }
                    break;
                case 2:
                    if(c<stackSize){
                        data[2][c++]=value;
                    }
                    break;
            }
        }

        public int pop(int stackNum) {
            switch (stackNum){
                case 0:
                    if(a>0){
                        return data[0][--a];
                    }
                    break;
                case 1:
                    if(b>0){
                        return data[1][--b];
                    }
                    break;
                case 2:
                    if(c>0){
                        return data[2][--c];
                    }
                    break;
            }
            return -1;
        }

        public int peek(int stackNum) {
            switch (stackNum){
                case 0:
                    if(a>0){
                        return data[0][a-1];
                    }
                    break;
                case 1:
                    if(b>0){
                        return data[1][b-1];
                    }
                    break;
                case 2:
                    if(c>0){
                        return data[2][c-1];
                    }
                    break;
            }
            return -1;
        }

        public boolean isEmpty(int stackNum) {
            switch (stackNum){
                case 0:
                    return a==0;
                case 1:
                    return b==0;
                case 2:
                    return c==0;
            }
            return false;
        }
    }
}

