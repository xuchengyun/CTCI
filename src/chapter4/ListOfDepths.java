package chapter4;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class ListOfDepths {
    class Node {
        int val;
        Node left;
        Node right;
        Node(int val) {
            this.val = val;
        }
    }

    // BFS
    public List<ArrayList<Node>> creatListOfDepth(Node node) {
        List<ArrayList<Node>> res = new ArrayList<>();
        if (node == null) return res;

        Queue<Node> q = new LinkedList<>();
        q.offer(node);
        while(!q.isEmpty()) {
            ArrayList<Node> temp = new ArrayList<>();
            while (!q.isEmpty()) {
                temp.add(q.poll());
            }
            res.add(temp);
            for (Node n : temp) {
                if (n.left != null) q.offer(n.left);
                if (n.right != null) q.offer(n.right);
            }
        }
        return res;
    }

    // BFS2

}
