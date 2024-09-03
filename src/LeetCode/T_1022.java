package LeetCode;

/**
 * @Author 白云浩
 * @Date 2024/9/3 20:13
 * @注释
 */

public class T_1022 {

    public static void main(String[] args) {
        TreeNode node = new TreeNode(1);
        node.left = new TreeNode(0);
        node.right = new TreeNode(1);
        node.left.left = new TreeNode(0);
        node.left.right = new TreeNode(1);
        node.right.left = new TreeNode(0);
        node.right.right = new TreeNode(1);
        sumRootToLeaf(node);
    }

    public static int sumRootToLeaf(TreeNode root) {
        return c(root, "");
    }

    public static int c(TreeNode node, String s) {
        if (node.left == null && node.right == null) {
            return Integer.parseInt(s + node.val, 2);
        }
        int sum = 0;
        if (node.left != null)
            sum += c(node.left, s + node.val);
        if (node.right != null)
            sum += c(node.right, s + node.val);
        return sum;
    }
}
