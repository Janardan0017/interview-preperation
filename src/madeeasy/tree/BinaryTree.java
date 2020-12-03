package madeeasy.tree;

import java.util.*;

public class BinaryTree {

    public void preOrder(BinaryTreeNode root) {
        if (root != null) {
            System.out.println(root.data);
            preOrder(root.left);
            preOrder(root.right);
        }
    }

    public List<Integer> preOrderTraversal(BinaryTreeNode root) {
        List<Integer> res = new ArrayList<>();
        if (root == null) {
            return res;
        }
        Stack<BinaryTreeNode> stack = new Stack<>();
        stack.push(root);
        while (!stack.isEmpty()) {
            BinaryTreeNode temp = stack.pop();
            res.add(temp.data);
            if (temp.right != null) {
                stack.push(temp.right);
            }
            if (temp.left != null) {
                stack.push(temp.left);
            }
        }
        return res;
    }

    public void inOrder(BinaryTreeNode root) {
        if (root != null) {
            preOrder(root.left);
            System.out.println(root.data);
            preOrder(root.right);
        }
    }

    public List<Integer> inOrderTraversal(BinaryTreeNode root) {
        List<Integer> res = new ArrayList<>();
        if (root == null) {
            return res;
        }
        Deque<BinaryTreeNode> stack = new ArrayDeque<>();
        stack.push(root);
        while (!stack.isEmpty()) {
            BinaryTreeNode temp = stack.pop();
            res.add(temp.data);
            if (temp.right != null) {
                stack.push(temp.right);
            }
            if (temp.left != null) {
                stack.push(temp.left);
            }
        }
        return res;
    }
}