package LeetCode;

public class T_814 {
    public TreeNode pruneTree(TreeNode root) {
        if (root==null) {
            return null;
        }
        root.left = pruneTree(root.left);
        root.right = pruneTree(root.right);
        if(root.val==0) {
            if(root.left==null&&root.right==null){
                return null;
            }
        }
        return root;
    }

    public static void main(String[] args) {

    }
}
