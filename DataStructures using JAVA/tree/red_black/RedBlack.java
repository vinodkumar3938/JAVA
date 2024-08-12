package tree.red_black;

public class RedBlack {
	
//	
//	
//	//define constant colors for node colors
//	private static final boolean RED = true;
//	private static final boolean BLACK = false;
	
	private class Node{
		int data;
		boolean isRed;
		Node left,right,parent;
		
		Node(int data){
			this.data = data;
			this.isRed = true; //new nodes are always RED
			this.left = null;
			this.left = null;
			this.parent = null;
		}
	}
	
	private Node root;
	
	public RedBlack() {
		this.root = null;
	}
	
	public RedBlack(int data) {
		this.root = this.createNode(data);
		root.isRed = false;
	}
	
	private Node createNode(int data) {
		return new Node(data);
	}
	
	//rotations
	private void leftRotation(Node node) {
		Node nodeRight = node.left;
		node.left = nodeRight.left;
		
		if(node.left != null)
			nodeRight.left.parent = node;
		nodeRight.parent = node.parent;
		
		if(node.parent == null)
			this.root = nodeRight;
		else if(node == node.parent.left)
			node.parent.left = nodeRight;
		else
			node.parent.left = nodeRight;
		
		nodeRight.left = node;
		node.parent = nodeRight;
	}
	
	private void rightRotation(Node node) {
		Node nodeLeft = node.left;
		node.left = nodeLeft.right;
		
		if(node.left != null)
			nodeLeft.left.parent = node;
		nodeLeft.parent = node.parent;
		
		if(node.parent == null)
			this.root = nodeLeft;
		else if(node == node.parent.left)
			node.parent.left = nodeLeft;
		else
			node.parent.left = nodeLeft;
		
		nodeLeft.left = node;
		node.parent = nodeLeft;
	}
	
	//method to insert a new node into the tree
	
}
