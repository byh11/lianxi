package LeetCode;

import java.util.ArrayDeque;
import java.util.Queue;

public class T_1161 {
    public static void main(String[] args) {
        TreeNode treeNode=new TreeNode(-100);
        treeNode.left=new TreeNode(-200);
        treeNode.right=new TreeNode(-300);
        treeNode.left.left=new TreeNode(-20);
        treeNode.left.right=new TreeNode(-5);
        treeNode.right.left=new TreeNode(-10);
        System.out.println(maxLevelSum(treeNode));
    }

    public static int maxLevelSum(TreeNode root) {
        int a= root.val;
        Queue<TreeNode> q1=new ArrayDeque<>();
        Queue<TreeNode> q2=new ArrayDeque<>();
        if(root.left!=null){
            q1.offer(root.left);
        }
        if(root.right!=null){
            q1.offer(root.right);
        }
        int y=1,y2=1;
        while (q1.size()!=0||q2.size()!=0){
            int x=0;
            while (q1.size()!=0){
                TreeNode t=q1.poll();
                x+=t.val;
                if(t.left!=null){
                    q2.offer(t.left);
                }
                if(t.right!=null){
                    q2.offer(t.right);
                }
            }
            y++;
            if(x>a){
                a=x;
                y2=y;
            }
            x=0;
            while (q2.size()!=0){
                TreeNode t=q2.poll();
                x+=t.val;
                if(t.left!=null){
                    q1.offer(t.left);
                }
                if(t.right!=null){
                    q1.offer(t.right);
                }
            }
            y++;
            if(x>a){
                a=x;
                y2=y;
            }
        }
        return y2;
    }

     public static int a(TreeNode root, Queue q1,Queue q2){
        if(root==null){
            return 0;
        }
        if(q1!=null){
            int x=0;
            while (q1!=null){
                q2.offer(root.left);
                q2.offer(root.right);
                x+=a((TreeNode) q1.poll(),q1,q2);
            }
        }
        return root.val;
     }
}
