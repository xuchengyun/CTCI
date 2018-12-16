package chapter4;

public class FirstCommonAncestor {
    class Node {
        int val;
        Node left;
        Node right;
        Node parent;

        Node(int val) {
            this.val = val;
        }
    }

    public Node findFirstCommonAncestor(Node p, Node q, Node root) {
        if (!covers(root, p) || !covers(root, q)) {
            return null;
        } else if (covers(p, q)) {
            return p;
        } else if (covers(q, p)) {
            return q;
        }

        Node sibling = getSibling(p);
        Node parent = p.parent;
        while (!covers(sibling, q)) {
            sibling = getSibling(parent);
            parent = parent.parent;
        }
        return parent;
    }

    boolean covers(Node root, Node p) {
        if (root == null) return false;
        if (root == p) return true;
        return covers(root.left, p) || covers(root.right, p);
    }

    Node getSibling(Node node) {
        if (node == null || node.parent == null) return null;
        Node parent = node.parent;
        return parent.left == node ? parent.right : parent.left;
    }

    // no parent pointer
    public Node findFirstCommonAncestor1(Node p, Node q, Node root) {
        if (root == null || root == p || root == q) return root;
        Node left = findFirstCommonAncestor1(p, q, root.left);
        Node right = findFirstCommonAncestor1(p, q, root.right);
        if (left != null && right != null) return root;
        return left == null ? right : left;
    }

    // optimized method
    public Node lowestCommonAncestor(Node root, Node p, Node q) {
        if (root == null || root == p || root == q) return root;
        Node left = lowestCommonAncestor(root.left, p, q);
        if (left != null && left != p && left != q) return left;
        Node right = lowestCommonAncestor(root.right, p, q);
        if (right != null && right != p && right != q) return right;
        if (left != null && right != null) return root;
        return left == null ? right : left;
    }
}
