package LeetCode;

import java.util.ArrayDeque;
import java.util.Queue;
import java.util.Scanner;

public class T_919 {
    static class CBTInserter{
        TreeNode node;

        Queue<TreeNode> queue=new ArrayDeque<>(10);
        public CBTInserter(TreeNode root) {
            this.node=root;
        }

        public int insert(int val) {
            queue=new ArrayDeque<>(10);
            return insert(node,val);
        }

        public int insert(TreeNode n,int val){
            if(n.left==null){
                n.left=new TreeNode(val);
                return n.val;
            }
            if(n.right==null){
                n.right=new TreeNode(val);
                return n.val;
            }
            queue.offer(n.left);
            queue.offer(n.right);
            return insert(queue.poll(),val);
        }

        public TreeNode get_root() {
            return node;
        }
    }

    public static void main(String[] args) {
        TreeNode node=new TreeNode(1);
//        node.setLeft(new TreeNode(2));
//        node.setRight(new TreeNode(3));
//        node.getLeft().setLeft(new TreeNode(4));
//        node.getLeft().setRight(new TreeNode(5));
//        node.getRight().setLeft(new TreeNode(6));

        CBTInserter cBTInserter = new CBTInserter(node);
        System.out.println(cBTInserter.insert(2));  // 返回 1
        System.out.println(cBTInserter.insert(3));  // 返回 2
        System.out.println(cBTInserter.insert(4));  // 返回 1
        System.out.println(cBTInserter.insert(5));  // 返回 2node=cBTInserter.get_root();
        Tree tree=new Tree();
        tree.tierOrder(node);
    }

}

class queue{
    private queueNode node=new queueNode(null);
    public void Enqueue(TreeNode node){
        if(node==null)
            return;
        queueNode t=this.node;
        while (t.getNext()!=null){
            t=t.getNext();
        }
        t.setNext(new queueNode(node));
    }

    public TreeNode Dequeue(){
        if(node.getNext()==null)
            return null;
        TreeNode t=node.getNext().getData();
        node.setNext(node.getNext().getNext());
        return t;
    }

}

class Tree{
    queue queue=new queue();
    public TreeNode Init(){
        Scanner scanner=new Scanner(System.in);
        System.out.print("请输入值：");
        int x=scanner.nextInt();
        if(x==0){
            return null;
        }
        TreeNode t= new TreeNode(x);
        t.setLeft(Init());
        t.setRight(Init());
        return t;
    }

    public void preorder(TreeNode node){
        if(node==null)
            return;
        System.out.println(node.getVal());
        preorder(node.getLeft());
        preorder(node.getRight());
    }

    public void middleOrder(TreeNode node){
        if(node==null)
            return;
        middleOrder(node.getLeft());
        System.out.println(node.getVal());
        middleOrder(node.getRight());
    }

    public void postOrder(TreeNode node){
        if(node==null)
            return;
        postOrder(node.getLeft());
        postOrder(node.getRight());
        System.out.println(node.getVal());
    }

    public void tierOrder(TreeNode node){
        if (node==null)
            return;
        System.out.println(node.getVal());
        queue.Enqueue(node.getLeft());
        queue.Enqueue(node.getRight());
        tierOrder(queue.Dequeue());
    }
}
class queueNode{
    private TreeNode data;
    private  queueNode next;

    public queueNode(TreeNode data){
        this.data=data;
    }
    public TreeNode getData() {
        return data;
    }

    public void setData(TreeNode data) {
        this.data = data;
    }

    public queueNode getNext() {
        return next;
    }

    public void setNext(queueNode next) {
        this.next = next;
    }
}