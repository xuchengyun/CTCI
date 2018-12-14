package chapter4;

public class Successor {
    class Node {
        int val;
        Node left;
        Node right;
        Node parent;
        Node(int val) {
            this.val = val;
        }
    }

    public Node findNextNode(Node node) {
        if (node == null) return null;
        if (node.right != null) return leftMost(node.right);
        while (node.parent != null && node.parent.right == node) {
            node = node.parent;
        }
        return node;
    }

    public Node leftMost(Node node) {
        if (node == null) return null;
        while (node.left != null) {
            node = node.left;
        }
        return node;
    }
}
