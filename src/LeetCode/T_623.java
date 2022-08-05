package LeetCode;

import java.util.ArrayDeque;
import java.util.Queue;

public class T_623 {
    public static void main(String[] args) {
        TreeNode treeNode=new TreeNode(2);
        treeNode.left=new TreeNode(3);
        treeNode.left.left=new TreeNode(1);
        addOneRow(treeNode,3,2);
    }

    public static TreeNode addOneRow(TreeNode root, int val, int depth) {
        Queue<TreeNode> q1=new ArrayDeque<>();
        Queue<TreeNode> q2=new ArrayDeque<>();
        if(depth-1==0){
            TreeNode node=new TreeNode(val);
            node.left=root;
            return node;
        }
        if(depth==2){
            if(root.left!=null){
                TreeNode t1=new TreeNode(val);
                t1.left=root.left;
                root.left=t1;
            }else {
                TreeNode t1=new TreeNode(val);
                root.left=t1;
            }
            if(root.right!=null){
                TreeNode t2=new TreeNode(val);
                t2.right=root.right;
                root.right=t2;
            }else {
                TreeNode t2=new TreeNode(val);
                root.right=t2;
            }
        }
        if(root.left!=null){
            q1.offer(root.left);
        }
        if(root.right!=null){
            q1.offer(root.right);
        }
        int x=3;
        while (q1.size()!=0 || q2.size()!=0){
            while (q1.size()!=0){
               if(x==depth){
                   while (q1.size()!=0){
                       TreeNode node=q1.poll();
                       if(node.left!=null){
                           TreeNode t1=new TreeNode(val);
                           t1.left=node.left;
                           node.left=t1;
                       }else {
                           TreeNode t1=new TreeNode(val);
                           node.left=t1;
                       }
                       if(node.right!=null){
                           TreeNode t2=new TreeNode(val);
                           t2.right=node.right;
                           node.right=t2;
                       }else {
                           TreeNode t2=new TreeNode(val);
                           node.right=t2;
                       }
                   }
                   q1=new ArrayDeque<>();
                   q2=new ArrayDeque<>();
               }
               TreeNode node=null;
               if(q1.size()>0){
                   node=q1.poll();
                   if(node.left!=null){
                       q2.offer(node.left);
                   }
                   if(node.right!=null){
                       q2.offer(node.right);
                   }
               }

            }
            x++;
            while (q2.size()!=0){
                if(x==depth){
                    while (q2.size()!=0){
                        TreeNode node=q2.poll();
                        if(node.left!=null){
                            TreeNode t1=new TreeNode(val);
                            t1.left=node.left;
                            node.left=t1;
                        }else{
                            TreeNode t1=new TreeNode(val);
                            node.left=t1;
                        }
                        if(node.right!=null){
                            TreeNode t2=new TreeNode(val);
                            t2.right=node.right;
                            node.right=t2;
                        }else {
                            TreeNode t2=new TreeNode(val);
                            node.right=t2;
                        }
                    }
                    q1=new ArrayDeque<>();
                    q2=new ArrayDeque<>();
                }
                TreeNode node=null;
                if(q2.size()>0){
                    node=q2.poll();
                    if(node.left!=null){
                        q1.offer(node.left);
                    }
                    if(node.right!=null){
                        q1.offer(node.right);
                    }
                }

            }
            x++;
        }
        return root;
    }
}
