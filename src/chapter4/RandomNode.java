package chapter4;

import java.util.Random;

/**
 * Created by xuchengyun on 12/30/18.
 */
public class RandomNode  {
    class TreeNode {
        private int data;
        public TreeNode left;
        public TreeNode right;

        public int getData() {
            return data;
        }

        public TreeNode getLeft() {
            return left;
        }

        public TreeNode getRight() {
            return right;
        }

        public int getSize() {
            return size;
        }

        private int size = 0;

        public TreeNode(int d) {
            data = d;
            size = 1;
        }

        public TreeNode getRandomNode() {
            int leftSize = left == null ? 0 : left.getSize();
            Random random = new Random();
            int index = random.nextInt(size);
            if (index < leftSize) {
                return left.getRandomNode();
            } else if (index == leftSize) {
                return this;
            } else {
                return right.getRandomNode();
            }
        }

        public void insertInOrder(int d) {
            if (d <= data) {
                if (left == null) {
                    left = new TreeNode(d);
                } else {
                    left.insertInOrder(d);
                }
            } else {
                if (right == null) {
                    right = new TreeNode(d);
                } else {
                    right.insertInOrder(d);
                }
            }
            size++;
        }

        public TreeNode find(int d) {
            if (d == data) {
                return this;
            } else if (d <= data) {
                return left != null ? left.find(d) : null;
            } else {
                return right != null ? right.find(d) : null;
            }
        }
    }




}
