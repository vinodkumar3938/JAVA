package tree.binarySearchTree;

public class BST {
	
	private class Node{
		int val;
		Node left,right;
		int count;
		
		public Node(int val) {
			this.val = val;
			this.left = null;
			this.right = null;
			count = 1;
		}
	}
	
	private Node root;
	//we have to pass root - if not passed then root=null
	public BST() {
		root = null;
	}
	//here val is passed to bst ,i.e root = passed val
	public BST(int val) {
		root = createNode(val);
	}
	
	private Node createNode(int val) {
		return new Node(val);
	}
	
	
	//Insertion in BST
	public void insert(int val) {
		//by comparing the value with root we will insert either in left or right
		//so we are taken 2 param => root - for checking the value > or < root
		root = insert(root,val);//this line inserts the val later in backtracks to the root
	}
	
	private Node insert(Node root,int val) {
		
		if(root == null)
			return createNode(val);
		
		if(val < root.val)
			root.left = insert(root.left,val);
		
		else if(val > root.val)
			root.right = insert(root.right,val);
		
		else // val == root
			++root.count;
		
		return root;
	}
	
	
	//Deletion in BST
	public void delete(int val) {
		root = delete(root,val);//this line deletes the val later in backtracks to the root
	}
	
	private Node delete(Node root , int val) {
		
		if(root == null)
			return null;
		
		if(val < root.val)
			root.left = delete(root.left,val);
		
		else if(val > root.val)
			root.right = delete(root.right,val);
		
		else {// val == root
			if(root.count > 1) {
				root.count--;
				return root;
			}
			//IF SINGLE NODE IS THERE then that node is root
			//suppose the root has right child
			if(root.left == null)
				return root.right;
			//suppose the root has only left child
			else if(root.right == null)
				return root.left;
			else {
				// root - have both childs
				//then rightMin or leftMax = newRoot
				Node temp =  rightMin(root.right);
				root.val = temp.val;
				root.right = delete(root.right,temp.val);
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
		return search(root,key);
	}
	
	private boolean search(Node root,int key) {
		if(root == null)
			return false;
		
		if(key < root.val)
			return search(root.left,key);
		
		else if(key > root.val)
			return search(root.right,key);
		
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
