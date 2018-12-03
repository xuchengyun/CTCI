package chapter2;

import java.util.HashSet;

public class RemoveDup {
    class Node {
        int val;
        Node next = null;
        Node (int val) {
            this.val = val;
        }
    }

    // we need a pre
    void removeDuplicate1(Node node) {
        HashSet<Integer> set = new HashSet<>();
        Node pre = new Node(0);
        while (node != null) {
            if (set.contains(node.val)) {
                pre.next = node.next;
            } else {
                set.add(node.val);
                pre = node;
            }
            node = node.next;
        }
    }

    private void removeDuplate2(Node head) {
        Node cur = head;

        while (cur.next != null) {
            Node HNode = cur;
            while (HNode.next != null) {
                if (cur.val != HNode.next.val) {
                    HNode = HNode.next;
                } else {
                    HNode.next = HNode.next.next;
                }
            }
            cur = cur.next;
        }
    }
}
