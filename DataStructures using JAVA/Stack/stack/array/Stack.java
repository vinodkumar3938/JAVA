package stack.array;

public class Stack {
	
	int top, capacity;
	int stack[];
	public Stack(int capacity) {
		super();
		this.capacity = capacity;
		this.top = -1;
		stack = new int[capacity];
	}
	
	void push(int val) {
		
		if(this.isFull())
			return;
		
		stack[++top] = val;
	}
	
	int pop(){
		
		if(this.isEmpty())
			return -1;
		
		return stack[top--];
	}
	
	int peek() {
		if(this.isEmpty())
			return -1;
		
		return stack[top];
	}
	
	int size() {
		
		return top+1;
	}
	
	boolean isEmpty() {
		
		return top==-1;
	}
	
	boolean isFull() {
		
		return top==(capacity-1);
	}
	
	
}

