package chapter4;

public class MinimalTree {

    class Node {
        int val;
        Node left;
        Node right;
        Node(int val) {
            this.val = val;
        }
    }
    // cut it to half for each recursion
    public Node createMinimalTree(int[] array) {
        return helper(array, 0, array.length - 1);
    }

    public Node helper(int[] array, int start, int end) {
        if (start > end) return null;
        int mid = (start + end) / 2;
        Node n = new Node(array[mid]);
        n.left = helper(array, start, end - 1);
        n.right = helper(array, start + 1, end);
        return n;
    }
}
