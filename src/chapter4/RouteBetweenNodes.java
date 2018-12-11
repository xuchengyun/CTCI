package chapter4;

import java.util.LinkedList;
import java.util.Queue;

public class RouteBetweenNodes {
    class Graph {
        public Node[] nodes;
    }

    class Node {
        public String name;
        public Node[] children;
        public boolean isVisited;
    }

    //BFS
    boolean search1(Graph g, Node start, Node end) {
        if (start == end) return true;
        Queue<Node> q = new LinkedList<>();
        q.offer(start);
        start.isVisited = true;
        while (!q.isEmpty()) {
            Node temp = q.poll();
            for (Node node : temp.children) {
                if (node.isVisited) {
                    continue;
                }
                if (start == node) return true;
                q.offer(node);
                node.isVisited = true;
            }
        }
        return false;
    }

    // DFS
    boolean search2(Graph g, Node start, Node end) {
        if (start == end) return true;
        start.isVisited = true;
        for (Node node : start.children) {
            if (node.isVisited) continue;
            return search2(g, node, end);
        }
        return false;
    }
}
