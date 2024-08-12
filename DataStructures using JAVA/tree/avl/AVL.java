package tree.avl;

public class AVL {

    private Node root;

    private class Node {
        int val;
        Node left;
        Node right;
        int height;

        Node(int key) {
            this.val = key;
            this.left = null;
            this.right = null;
            this.height = 1;
        }
    }

    private int height(Node node) {
        if (node == null) {
            return 0;
        }
        return node.height;
    }

    private int balanceFactor(Node node) {
        if (node == null) {
            return 0;
        }
        return height(node.left) - height(node.right);
    }

    private Node leftRotation(Node root) {
        Node temp = root.right;
        root.right = temp.left;
        temp.left = root;
        root.height = Math.max(height(root.left), height(root.right)) + 1;
        temp.height = Math.max(height(temp.left), height(temp.right)) + 1;
        return temp;
    }

    private Node rightRotation(Node root) {
        Node temp = root.left;
        root.left = temp.right;
        temp.right = root;
        root.height = Math.max(height(root.left), height(root.right)) + 1;
        temp.height = Math.max(height(temp.left), height(temp.right)) + 1;
        return temp;
    }
    

    public void insert(int val) {
        root = insertRecursive(root, val);
    }

    private Node insertRecursive(Node root, int val) {
        if (root == null) {
            return new Node(val);
        }

        if (val < root.val) {
            root.left = insertRecursive(root.left, val);
        } else if (val > root.val) {
            root.right = insertRecursive(root.right, val);
        } else {
            return root;
        }

        root.height = Math.max(height(root.left), height(root.right)) + 1;

        int balance = balanceFactor(root);

        if (balance > 1 && val < root.left.val) {
            return rightRotation(root);
        }
        
        if (balance > 1 && val > root.left.val) {
            root.left = leftRotation(root.left);
            return rightRotation(root);
        }

        if (balance < -1 && val > root.right.val) {
            return leftRotation(root);
        }
        
        if (balance < -1 && val < root.right.val) {
            root.right = rightRotation(root.right);
            return leftRotation(root);
        }

        return root;
    }
}
