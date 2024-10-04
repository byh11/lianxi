package Test;

import java.util.Scanner;

public class T16 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n=in.nextInt();
        int m=in.nextInt();
        int[] jz=new int[n];
        Node list=new Node();
        list.val=in.nextInt();
        Node node1=list;
        for (int i = 1; i < n; i++) {
            Node node=new Node();
            node.val=in.nextInt();
            node1.next=node;
            node.pre=node1;
            node1=node1.next;
        }
        node1.next=list;
        list.pre=node1;
        String[] jc=new String[m];
        int[] jc1=new int[m];
        in.nextLine();
        for (int i = 0; i < m; i++) {
            jc[i]=in.nextLine();
            jc1[i]=in.nextInt();
            in.nextLine();
        }
        for (int i = 0; i < m; i++) {
            int val=jc1[i];
            int sum=0;
            if("L".equals(jc[i])){
                for (int j = 0; j < val; j++) {
                    sum+=list.val;
                    list=list.next;
                }
            }else {
                for (int j = 0; j < val; j++) {
                    sum+=list.val;
                    list=list.pre;
                }
            }
            System.out.println(sum);
        }
    }


    static class Node{
        public int val;
        public Node next;
        public Node pre;

        public int getVal() {
            return val;
        }

        public void setVal(int val) {
            this.val = val;
        }

        public Node getNext() {
            return next;
        }

        public void setNext(Node next) {
            this.next = next;
        }

        public Node getPre() {
            return pre;
        }

        public void setPre(Node pre) {
            this.pre = pre;
        }
    }

}
