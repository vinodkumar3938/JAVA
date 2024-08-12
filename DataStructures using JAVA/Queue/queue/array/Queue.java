package queue.array;

public class Queue {

	private int front, rear;
	private int capacity, size;
	int queue[];
	
	public Queue(int capacity) {
		queue = new int[capacity];
		front = rear = -1;
		this.capacity = capacity;
		size = 0;
	}
	
	void enQueue(int val) {
		
		if(this.isFull())
			return;
		
		if(this.isEmpty()) 
			front = rear = 0;		
		
		else 
			rear = (rear+1) % capacity;
			
		queue[rear] = val;
		size++;
	}
	
	int deQueue() {
		
		if(this.isEmpty())
			return -1;
		
		int temp = queue[front];
		size--;
		
		if(front==rear)
			front = rear = -1;
		else		
			front = (front+1)%this.capacity;
		
		return temp;
	}
	
	int front() {
		
		if(this.isEmpty())
			return -1;
		
		return queue[front];
	}
	
	int rear() {
		
		if(this.isEmpty())
			return -1;
		
		return queue[rear];
	}
	
	int size() {
		
		return size;
	}
	
	boolean isEmpty() {
		
		return front==-1 && rear==-1;
	}
	
	boolean isFull() {
		
		return (rear+1)%capacity == front;
	}
	
	int getCapacity() {
		return this.capacity;
	}
	
}






