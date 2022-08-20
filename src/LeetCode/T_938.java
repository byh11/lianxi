package LeetCode;

public class T_938 {
    public int rangeSumBST(TreeNode root, int low, int high) {
        if(root==null){
            return 0;
        }
        int a=0;
        if(root.val>=low && root.val<=high){
            a+= root.val;
        }
        a+=rangeSumBST(root.left,low,high);
        a+=rangeSumBST(root.right,low,high);
        return a;
    }

    public static void main(String[] args) {

    }
}
