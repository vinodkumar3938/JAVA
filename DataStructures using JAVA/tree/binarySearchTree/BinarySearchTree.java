package tree.binarySearchTree;

public class BinarySearchTree {

	private class Node{
		
		int val;
		Node left, right;
		int count;
		
		public Node(int val) {
			this.val = val;
			count = 1;	
		}
	}
	
	private Node root;
	
	public BinarySearchTree() {
		root = null;
	}
	
	public BinarySearchTree(int val) {
		root = createNode(val);
	}

	private Node createNode(int val) {
		
		return new Node(val);
	}
	
	public void insert(int val) {
		root = insert(root, val);
	}
	
	private Node insert(Node root, int val) {
		
		if(root==null)
			return createNode(val);
		
		if(val < root.val)
			root.left = insert(root.left, val);
		
		else if(val > root.val)
			root.right = insert(root.right, val);
		
		else
			++root.count;
		
		return root;
	}
	
	public void delete(int val) {
		root = delete(root, val);
	}
	
	private Node delete(Node root, int val) {
		
		if(root==null)
			return null;
		
		if(val < root.val)
			root.left = delete(root.left, val);
		
		else if(val > root.val)
			root.right = delete(root.right, val);
		
		else {
			//incase of root == val
			if(root.count>1) {
				root.count--;
				return root;
			}				
						
			if(root.left == null)
				return root.right;
			
			else if(root.right == null)
				return root.left;
			
			else {
				
				Node temp = rightMin(root.right);
				root.val = temp.val;
				root.right = delete(root.right, temp.val);
			}
		}
		
		return root;		
	}
	
	private Node rightMin(Node right) {
		
		Node current = right;
		
		while(current.left != null)
			current = current.left;
		
		return current;
	}
	
	public boolean search(int key) {
		return search(root, key);
	}
	
	private boolean search(Node root, int key) {
		
		if(root == null)
			return false;
		
		if(key < root.val)
			return search(root.left, key);
		
		else if(key > root.val)
			return search(root.right, key);
		
		else
			return true;
		
		
	}

	public void inOrder() {
		inOrder(root);
		System.out.println();
	}
	
	private void inOrder(Node root) {
		
		if(root == null)
			return;
		
		inOrder(root.left);
		System.out.print(root.val + " ");
		inOrder(root.right);
	}
}


