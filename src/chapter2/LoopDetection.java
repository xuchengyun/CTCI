package chapter2;

public class LoopDetection {
    class Node {
        int val;
        Node next = null;
        Node (int val) {
            this.val = val;
        }
    }

    Node findStart(Node head) {
        Node fast = head;
        Node slow = head;

        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
            if (slow == fast) break;
        }

        if (fast == null || fast.next == null) return null;

        slow = head;
        while (slow != fast) {
            slow = slow.next;
            fast = fast.next;
        }
        return slow;
    }

}
