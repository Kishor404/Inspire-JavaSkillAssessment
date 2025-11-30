// Implement a binary tree data structure in Java using either an array or a linked list. The tree should have methods for inserting, deleting, and searching for nodes.

class Node {
    int value;
    Node left, right;

    Node(int value) {
        this.value = value;
    }
}

class BinaryTree {
    Node root;

    public void insert(int value) {
        root = insertRec(root, value);
    }

    private Node insertRec(Node root, int value) {
        if (root == null) {
            return new Node(value);
        }
        if (value < root.value) root.left = insertRec(root.left, value);
        else if (value > root.value) root.right = insertRec(root.right, value);
        return root;
    }

    public boolean search(int value) {
        return searchRec(root, value);
    }

    private boolean searchRec(Node root, int value) {
        if (root == null) return false;
        if (value == root.value) return true;
        if (value < root.value) return searchRec(root.left, value);
        return searchRec(root.right, value);
    }

    public void delete(int value) {
        root = deleteRec(root, value);
    }

    private Node deleteRec(Node root, int value) {
        if (root == null) return null;

        if (value < root.value) root.left = deleteRec(root.left, value);
        else if (value > root.value) root.right = deleteRec(root.right, value);
        else {
            if (root.left == null) return root.right;
            else if (root.right == null) return root.left;
            Node min = minValue(root.right);
            root.value = min.value;
            root.right = deleteRec(root.right, min.value);
        }
        return root;
    }

    private Node minValue(Node node) {
        while (node.left != null) node = node.left;
        return node;
    }

    public void inorder() {
        inorderRec(root);
        System.out.println();
    }

    private void inorderRec(Node root) {
        if (root != null) {
            inorderRec(root.left);
            System.out.print(root.value + " ");
            inorderRec(root.right);
        }
    }
}

public class Q7 {
    public static void main(String[] args) {
        BinaryTree tree = new BinaryTree();
        tree.insert(5);
        tree.insert(2);
        tree.insert(8);
        tree.insert(1);
        tree.insert(3);

        tree.inorder();
        System.out.println("Search 3: " + tree.search(3));
        tree.delete(2);
        tree.inorder();
    }
}