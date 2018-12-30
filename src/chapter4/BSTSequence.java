package chapter4;

import java.util.ArrayList;
import java.util.LinkedList;

public class BSTSequence {
    class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode parent;

        TreeNode(int val) {
            this.val = val;
        }
    }

    ArrayList<LinkedList<Integer>> allSequences(TreeNode node) {
        ArrayList<LinkedList<Integer>> result = new ArrayList<LinkedList<Integer>>();
        if (node == null) {
            result.add(new LinkedList<Integer>());
            return result;
        }
        return result;
    }
}
