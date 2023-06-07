package simpleTree;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class TreeNode {
    private final int value;

    private TreeNode left;
    private TreeNode right;

    public TreeNode(int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }

    public TreeNode getLeft() {
        return left;
    }

    public void setLeft(TreeNode left) {
        this.left = left;
    }

    public TreeNode getRight() {
        return right;
    }

    public void setRight(TreeNode right) {
        this.right = right;
    }


    public List<Integer> breadthFirst(TreeNode treeRoot) {
        List<Integer> values = new ArrayList<>();
        Queue<TreeNode> treeNodes = new LinkedList<>();

        treeNodes.add(treeRoot);

        while (!treeNodes.isEmpty()) {
            TreeNode first = treeNodes.remove();
            values.add(first.getValue());
            if (first.getLeft() != null){
                treeNodes.add(first.getLeft());
            }
            if (first.getRight() != null){
                treeNodes.add(first.getRight());
            }

        }

        return values;
    }
}
