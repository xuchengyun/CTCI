package chapter2;

public class SumLists {
    // recursion
    class Node {
        int val;
        Node next = null;
        Node (int val) {
            this.val = val;
        }
    }

    int carry = 0;
    Node res = null;

    Node addTwoLists(Node first, Node second) {
        if (first == null && second == null) return null;
        Node res = null;
        Node temp = null;
        int carry = 0;
        while (first != null || second != null) {
            int sum = (first == null ? 0 : first.val) + (second == null ? 0 : second.val) + carry;
            carry = sum / 10;
            int val = sum % 10;
            Node curNode = new Node(val);
            if (res == null) {
                res = curNode;
                temp = curNode;
            } else {
                temp.next = curNode;
                temp = temp.next;
            }
            first = first == null ? null : first.next;
            second = second == null ? null : second.next;
        }
        if (carry > 0) {
            temp.next = new Node(carry);
        }
        return res;
    }

    // Using recursion to solve this problem
    Node addTwoLists1(Node first, Node second) {
        int len1 = getLength(first);
        int len2 = getLength(second);

        if (len1 < len2) {
            first = paddingZero(first, len2 - len1);
        } else {
            second = paddingZero(second, len1 - len2);
        }
        addListHelper(first, second);
        if (carry != 0) {
            Node cur = new Node(carry);
            cur.next = res;
            res = cur;
        }
        return res;
    }

    private Node paddingZero(Node node, int len) {
        Node head = node;
         while(len > 0) {
             Node pad = new Node(0);
             pad.next = head;
             head = pad;
             len--;
         }
         return head;
    }

    private void addListHelper(Node first, Node second) {
        if (first == null && second == null) return;
        addListHelper(first.next, second.next);
        int sum = first.val + second.val + carry;
        carry = sum / 10;
        sum = sum % 10;
        push(sum);
    }

    private void push(int digit) {
        Node cur = new Node(digit);
        cur.next = res;
        res = cur;
    }

    private int getLength(Node node) {
        int res = 0;
        while (node != null) {
            res++;
            node = node.next;
        }
        return res;
    }
}
