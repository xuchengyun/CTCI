package chapter2;
import java.util.ArrayList;
import java.util.List;

public class ReturnKthToLast {
    class Node {
        int val;
        Node next = null;
        Node (int val) {
            this.val = val;
        }
    }

    // Iterative
    public Node returnKthToLast1(Node head, int k) {
        Node n1 = head;
        Node n2 = head;

        for (int i = 0; i < k; i++) {
            if (n1 == null) return null;
            n1 = n1.next;
        }

        while (n1 != null) {
            n1 = n1.next;
            n2 = n2.next;
        }
        return n2;
    }

    // Recursion
    public int returnKthToLast2(Node head, int k) {
        if (head == null) return 0;
        int index = returnKthToLast2(head.next, k) + 1;
        if (index == k) {
            System.out.println(k + "th to last node is" + head.val);
        }
        return index;
    }

}
