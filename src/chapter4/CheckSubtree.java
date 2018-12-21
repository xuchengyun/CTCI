package chapter4;

public class CheckSubtree {
    class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode parent;

        TreeNode(int val) {
            this.val = val;
        }
    }
    boolean containsTree(TreeNode t1, TreeNode t2) {
        StringBuilder sb1 = new StringBuilder();
        StringBuilder sb2 = new StringBuilder();
        generateString(t1, sb1);
        generateString(t2, sb2);
        return sb1.toString().contains(sb2.toString());
    }

    void generateString(TreeNode t, StringBuilder sb) {
        if (t == null) {
            sb.append("X");
            return;
        }
        sb.append(t.val);
        generateString(t.left, sb);
        generateString(t.right, sb);
    }

    boolean containsTree2(TreeNode t1, TreeNode t2) {
        if (t2 == null) {
            return true;
        }
        return helper(t1, t2);
    }

    boolean helper(TreeNode t1, TreeNode t2) {
        if (t1 == null) {
            return false;
        } else if (t1.val == t2.val && matchTree(t1, t2)) {
            return true;
        } else {
            return helper(t1.left, t2) || helper(t1.right, t2);
        }
    }

    boolean matchTree(TreeNode t1, TreeNode t2) {
        if (t1 == null && t2 == null) return true;
        if (t1 == null || t2 == null) return false;
        if (t1.val != t2.val) return false;
        return matchTree(t1.left, t2.left) && matchTree(t2.right, t2.right);
    }
}
