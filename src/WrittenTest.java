

import java.util.HashMap;
import java.util.Stack;

public class WrittenTest {

    public static void main(String[] args) {
//        System.out.println(Palindrome("abcba"));
//        System.out.println(getMap("14444112442aa44442244311222222244445444243334444ccc4444"));

        TreeNode root = new TreeNode(1);
        root.setLeft(new TreeNode(2));
        root.getLeft().setLeft(new TreeNode(3));
        root.getLeft().getLeft().setLeft(new TreeNode(6));
        root.getLeft().setRight(new TreeNode(4));
        root.getLeft().getRight().setLeft(new TreeNode(10));
        root.setRight(new TreeNode(9));
        root.getRight().setLeft(new TreeNode(7));
        root.getRight().setRight(new TreeNode(8));
        ergodic(root);
    }


    //第一题,2min
    public static boolean Palindrome(String s) {
        if (s.charAt(0) == s.charAt(s.length() - 1)) {
            if (s.length() <= 2) {
                return true;
            }
            return Palindrome(s.substring(1, s.length() - 1));
        } else {
            return false;
        }
    }

    //第二题,8min
    public static HashMap<String, Integer> getMap(String s) {
        HashMap<Character, Integer> map = new HashMap<>();
        int max = 0;
        char k = ' ';
        char c = s.charAt(0);
        for (int i = 0; i < s.length(); i++) {
            if (map.size() != 0 && map.get(c) > max) {
                max = map.get(c);
                k = c;
            }
            if (s.charAt(i) == c) {
                if (map.containsKey(c)) {
                    map.put(c, map.get(c) + 1);
                } else {
                    map.put(c, 1);
                }
            } else {
                c = s.charAt(i);
                map.put(c, 1);
            }
        }
        HashMap<String, Integer> map1 = new HashMap<>();
        map1.put(String.valueOf(k), max);
        return map1;
    }


    //第三题,12min
    public static void ergodic(TreeNode root) {
        Stack<TreeNode> stack = new Stack<>();
        stack.push(root);
        while (stack.size() != 0) {
            TreeNode node = stack.peek();
            if(node.left != null){
                stack.push(node.getLeft());
                node.left = null;
                continue;
            }
            if(node.right != null){
                stack.push(node.getRight());
                node.right = null;
                continue;
            }
            System.out.println(stack.pop().getVal());
        }
    }


    public static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode() {}
        TreeNode(int val) { this.val = val; }
        TreeNode(int val, TreeNode left, TreeNode right) {
            this.val = val;
            this.left = left;
            this.right = right;
        }

        public int getVal() {
            return val;
        }

        public void setVal(int val) {
            this.val = val;
        }

        public TreeNode getLeft() {
            return left;
        }

        public void setLeft(TreeNode left) {
            this.left = left;
        }

        public TreeNode getRight() {
            return right;
        }

        public void setRight(TreeNode right) {
            this.right = right;
        }
    }


}
