package LeetCode;

public class T_654 {
    public static TreeNode constructMaximumBinaryTree(int[] nums) {
        if (nums.length==0){
            return null;
        }
        int[] a=findMax(nums);
        int[] l=new int[a[0]];
        int[] r=new int[nums.length-a[0]-1];
        int ln=0,rn=0;
        for (int i = 0; i < nums.length; i++) {
            if (i<a[0]){
                l[ln++]=nums[i];
            }else if(i>a[0]){
                r[rn++]=nums[i];
            }
        }
        TreeNode node = new TreeNode(a[1]);
        node.left=constructMaximumBinaryTree(l);
        node.right=constructMaximumBinaryTree(r);
        return node;
    }
    public static int[] findMax(int[] nums){
        int max=nums[0];
        int maxi=0;
        for (int i = 0; i < nums.length; i++) {
            if (max < nums[i]) {
                maxi = i;
                max = nums[i];
            }
        }
        return new int[]{maxi,max};
    }

    public static void main(String[] args) {
        TreeNode node= constructMaximumBinaryTree(new int[]{3, 2, 1, 6, 0, 5});
    }
}
