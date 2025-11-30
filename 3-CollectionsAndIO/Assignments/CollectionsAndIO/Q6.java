// 6) Implement a binary tree data structure in Java using either an array or a linked list. The tree should have methods for inserting, deleting, and searching for nodes.

public class Q6 {
    static class Node {
        int data;
        Node left, right;

        Node(int d) {
            data = d;
        }
    }

    static class BinarySearchTree {
        Node root;

        public void insert(int value) {
            root = insertRec(root, value);
        }

        private Node insertRec(Node root, int value) {
            if (root == null) {
                return new Node(value);
            }
            if (value < root.data) {
                root.left = insertRec(root.left, value);
            } else if (value > root.data) {
                root.right = insertRec(root.right, value);
            }
            return root;
        }

        public boolean search(int value) {
            return searchRec(root, value) != null;
        }

        private Node searchRec(Node root, int value) {
            if (root == null || root.data == value) return root;
            if (value < root.data) return searchRec(root.left, value);
            return searchRec(root.right, value);
        }

        public void delete(int value) {
            root = deleteRec(root, value);
        }

        private Node deleteRec(Node root, int value) {
            if (root == null) return null;

            if (value < root.data) {
                root.left = deleteRec(root.left, value);
            } else if (value > root.data) {
                root.right = deleteRec(root.right, value);
            } else {
                if (root.left == null) return root.right;
                if (root.right == null) return root.left;

                Node min = findMin(root.right);
                root.data = min.data;
                root.right = deleteRec(root.right, min.data);
            }
            return root;
        }

        private Node findMin(Node node) {
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
                System.out.print(root.data + " ");
                inorderRec(root.right);
            }
        }
    }

    public static void main(String[] args) {
        BinarySearchTree bst = new BinarySearchTree();
        bst.insert(50);
        bst.insert(30);
        bst.insert(70);
        bst.insert(20);
        bst.insert(40);

        bst.inorder();
        System.out.println("Search 40: " + bst.search(40));
        bst.delete(30);
        bst.inorder();
    }
}
