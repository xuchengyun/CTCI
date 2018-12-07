package chapter2;

/*
     1 -> 2 -> 3 \
                   5 -> 6 -> 7-> 8
1 -> 2 -> 3 -> 4 /
*/
public class Intersection {
    class Node {
        int val;
        Node next = null;
        Node (int val) {
            this.val = val;
        }
    }

    class Result {
        Node tail;
        int size;

    }
    public Node findintersection(Node node1, Node node2) {
        int len1 = getLen(node1);
        int len2 = genLen(node2);
    }

    int genLenAndTail(Node node) {

    }
}
