package zuoye;

import java.util.HashMap;
import java.util.Stack;

/***
 * 姓名：白云浩
 * 手机号：15164881433
 * 应聘岗位：后端开发工程师
 * 是否在京：否
 * 最早入职时间：面试通过后
 * 可以实现6个月以上
 * 毕业后打算工作
 * 目前在天津
 */


public class TiMu {


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
