package LeetCode;

import java.util.ArrayDeque;
import java.util.Queue;

public class T_1302 {
    public static int deepestLeavesSum(TreeNode root) {
        Queue<TreeNode> q1=new ArrayDeque<>();
        Queue<TreeNode> q2=new ArrayDeque<>();
        if(root.left!=null){
            q1.offer(root.left);
        }
        if(root.right!=null){
            q1.offer(root.right);
        }
        int max=root.val;
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
            if(x!=0){
                max=x;
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
            if(x!=0){
                max=x;
            }
        }
        return max;
    }

    public static void main(String[] args) {
        TreeNode root=new TreeNode(50);
        root.right=new TreeNode(54);
        root.right.left=new TreeNode(98);
        root.right.right=new TreeNode(6);
        root.right.right.right=new TreeNode(34);
        System.out.println(deepestLeavesSum(root));
    }
}
