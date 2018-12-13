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
    public List<ArrayList<Node>> createListOfDepth1(Node node) {
        List<ArrayList<Node>> res = new ArrayList<>();
        if (node == null) return res;
        ArrayList<Node> cur = new ArrayList<>();
        cur.add(node);
        res.add(cur);
        while(cur.size() != 0) {
            ArrayList<Node> temp = new ArrayList<>();
            for (Node n : cur) {
                if (n.left != null) temp.add(n.left);
                if (n.right != null) temp.add(n.right);
            }
            cur = temp;
            res.add(cur);
        }
        return res;
    }

    //DFS
    public List<ArrayList<Node>> createListOfDepth2(Node node) {
        List<ArrayList<Node>> res = new ArrayList<>();
        helper(node, res, 0);
        return res;
    }

    private void helper(Node node, List<ArrayList<Node>> res, int level) {
        if (node == null) return;

        if (res.size() == level) {
            ArrayList<Node> curList = new ArrayList<>();
            curList.add(node);
            res.add(curList);
        } else {
            res.get(level).add(node);
        }
        helper(node.left, res, level + 1);
        helper(node.right, res, level + 1);
    }
}
