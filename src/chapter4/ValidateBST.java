package chapter4;

public class ValidateBST {
    class Node {
        int val;
        Node left;
        Node right;
        Node(int val) {
            this.val = val;
        }
    }

    // in order traverse(all elements are different)
    Integer lastPrinted = null;
    boolean checkBST(Node n) {
        if (n == null) return true;
        if (!checkBST(n.left)) return false;
        if (lastPrinted != null && lastPrinted >= n.val) return false;
        lastPrinted = n.val;
        if (!checkBST(n.right)) return false;
        return true;
    }

    // MIN and MAX to solve it
    boolean checkBST1(Node n) {
        return helper(n, null, null);
    }

    boolean helper(Node n, Integer max, Integer min) {
        if (n == null) return true;
        if (min != null && n.val <= min) return false;
        if (max != null && n.val > max) return false;
        if (!helper(n.left, n.val, min) && !helper(n.right, max, n.val)) return false;
        return true;
    }
}
