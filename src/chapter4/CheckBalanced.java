package chapter4;
/*
balanced binary tree:
for each node in a tree, the heights of two subtrees of any node never differ by more than one
 */
public class CheckBalanced {
    class Node {
        int val;
        Node left;
        Node right;
        Node(int val) {
            this.val = val;
        }
    }
    // brute force
    // need to think about all the cases for brute force
    int getHeight(Node root) {
        if (root == null) return -1;
        return Math.max(getHeight(root.left), getHeight(root.right)) + 1;
    }

    boolean isBalanced(Node root) {
        if (root == null) return true;
        int diff = Math.abs(getHeight(root.left) - getHeight(root.right));
        if (diff > 1) {
            return false;
        } else {
            return isBalanced(root.left) && isBalanced(root.right);
        }
    }


    // Passing error code
    int checkHeight(Node root) {
        if (root == null) return -1;
        int left = checkHeight(root.left);
        if (left == Integer.MIN_VALUE) return Integer.MIN_VALUE;
        int right = checkHeight(root.right);
        if (right == Integer.MIN_VALUE) return Integer.MIN_VALUE;

        if (right - left > 1) {
            return Integer.MIN_VALUE;
        } else {
            return Math.max(left, right) + 1;
        }
    }

    boolean isBalanced1(Node root) {
        return checkHeight(root) == Integer.MIN_VALUE;
    }

    // combine height with current node together
    
}
