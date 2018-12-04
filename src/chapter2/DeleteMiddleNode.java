package chapter2;

public class DeleteMiddleNode {
    class Node {
        int val;
        Node next = null;
        Node (int val) {
            this.val = val;
        }
    }

    public void deleteMiddleNode(Node node) {
        if (node == null || node.next == null) return;
        Node next = node.next;
        next.val = node.val;
        node.next = next.next;
    }
}
