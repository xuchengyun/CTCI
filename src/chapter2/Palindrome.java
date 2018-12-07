package chapter2;

public class Palindrome {
    class Node {
        int val;
        Node next = null;
        Node (int val) {
            this.val = val;
        }
    }
    public boolean isPalindrome(Node node) {
        Node reverseNode = reverseLinkedList1(node);
        while (node != null) {
            if (node.val != reverseNode.val) return false;
            node = node.next;
            reverseNode = reverseNode.next;
        }
        return true;
    }

    // recursion
    public Node reverseLinkedList1(Node node) {
        if (node == null || node.next == null) return node;
        Node next = reverseLinkedList1(node.next);
        node.next.next = node;
        node.next = null;
        return next;
    }

    // iteration
    public Node reverseLinkedList2(Node node) {
        Node head = null;

        while(node.next != null) {
            Node temp = node.next;
            node.next = head;
            head = node;
            node = temp;
        }
        return head;
    }

}
