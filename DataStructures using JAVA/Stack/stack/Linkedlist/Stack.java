package stack.Linkedlist;

public class Stack {

	Node top;
	int size;
	
	public Stack() {
		super();
		this.top = null;
		this.size = 0;
	}
	
	void push(int val) {
		
		Node newNode = new Node(val);
		
		if(top==null) {
			top = newNode;
		}
		else {
			newNode.next = top;
			top = newNode;
		}
		
		size++;
	}
	
	int pop() {
		
		if(this.isEmpty())
			return -1;
		
		int temp = top.val;
		top = top.next;
		size--;
		
		return temp;
	}
	
	int peek() {
		
		if(this.isEmpty())
			return -1;
		
		return top.val;
	}
	
	int size() {
		
		return size;
	}
	
	boolean isEmpty() {
		
		return top==null;
	}
	
}
