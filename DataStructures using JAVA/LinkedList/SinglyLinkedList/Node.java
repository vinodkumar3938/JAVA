package SinglyLinkedList;

public class Node {

	String city, state;
	Node next;
	
	public Node(String city, String state) {
		super();
		this.city = city;
		this.state = state;
		this.next = null; //default value of next is null, no need to write this extra line of code
	}	
}
