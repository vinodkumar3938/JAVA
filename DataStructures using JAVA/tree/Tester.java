package tree;

//import tree.binarySearchTree.BinarySearchTree;
import tree.binarySearchTree.BST;
//import tree.avl.AVL;
//import tree.red_black.RedBlack;

public class Tester {

	public static void main(String[] args) {


		//BinarySearchTree tree = new BinarySearchTree(54);
		BST tree = new BST(54);
		tree.inOrder();
		
		tree.insert(78);
		tree.insert(24);
		
		tree.insert(19);
		tree.insert(19);
		tree.insert(19);
		
		tree.insert(12);
		tree.insert(7);
		tree.insert(6);
		
		tree.inOrder();
		
		tree.delete(19);
		tree.delete(19);
		tree.delete(54);
		tree.inOrder();
		
		System.out.println("Search 7: " + tree.search(7));
		System.out.println("Search 54: " + tree.search(54));
	}
}
