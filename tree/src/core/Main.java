package core;

/**
 * Created by fragalli on 14/11/17.
 */
public class Main {
    public static void main(String[] args) {
        Node node1 = new Node(1, null, null);
        Node node2 = new Node(2, null, null);
        Node node3 = new Node(3, node1, node2);
        Node node4 = new Node(4, null, null);
        Node node5 = new Node(5, null, null);
        Node node6 = new Node(6, node4, node5);
        Node nodeRoot = new Node(7, node3, node6);

        BinaryTree tree = new BinaryTree(nodeRoot);
        Node node = tree.getRoot().findNode(3);

        int sumChildsValue = node.sum(node);
        System.out.println("Soma = " + sumChildsValue);

    }

}
