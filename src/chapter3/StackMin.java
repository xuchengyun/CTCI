package chapter3;

public class StackMin {
    class Node {
        int curMin;
        int val;
        Node next;
        Node(int val) {
            this.val = val;
            curMin = 0;
            next = null;
        }
    }

    int size;
    Node top;
    public StackMin() {
        size = 0;
        top = null;
    }

    public void push(int val) {
        Node n = new Node(val);
        n.next = top;
        if (val < top.curMin) {
            n.curMin = val;
        } else {
            n.curMin = top.curMin;
        }
        top = n;
        size++;
    }

    public int pop() {
        Node n = top.next;
        top = null;
        return n.val;
    }

    public int min() {
        return top.curMin;
    }
}
