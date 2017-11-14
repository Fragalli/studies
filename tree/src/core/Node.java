package core;

/**
 * Created by fragalli on 14/11/17.
 */
public class Node {
    private int value;
    private Node left;
    private Node right;

    public Node() {
    }

    public Node(int value, Node left, Node right) {
        this.value = value;
        this.left = left;
        this.right = right;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    public Node getLeft() {
        return left;
    }

    public void setLeft(Node left) {
        this.left = left;
    }

    public Node getRight() {
        return right;
    }

    public void setRight(Node right) {
        this.right = right;
    }

    public int sum(Node child) {
        if (child == null) {
            return 0;
        }
        int leftSum = sum(child.getLeft());
        int rightSum = sum(child.getRight());

        return child.getValue() + leftSum + rightSum;
    }

    public Node findNode(int value) {
        Node focusNode = this;

        while (focusNode.getValue() != value) {
            if (value < focusNode.getValue()) {
                focusNode = focusNode.left;

            } else {
                focusNode = focusNode.right;
            }

            if (focusNode == null)
                return null;
        }
        return focusNode;
    }

}
