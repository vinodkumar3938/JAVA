package SinglyLinkedList;

public class SinglyLinkedList {
	
	Node head, tail;
	int size;
	
	public void insertAtEnd(String city, String state) {
				
		Node newNode = new Node(city, state);
		
		if(head==null) {
			head = tail = newNode;
			size++;
			return;
		}
		
		tail.next = newNode;
		tail = newNode;
		size++;
		
	}
	
	public void insertAtBeginning(String city, String state) {
		
		Node newNode = new Node(city, state);
		
		if(head==null) {
			head = tail = newNode;
			size++;
			return;
		}
		
		newNode.next = head;
		head = newNode;
		size++;
	}
	
	public void insertAt(int index, String city, String state) {
		
		Node newNode = new Node(city, state);
		
		if(head==null) {
			head = tail = newNode;
			size++;
			return;
		}
		
		if(index<=0) {
			this.insertAtBeginning(city, state);
			return;
		}
		
//		if(index>=size) {
//			this.insertAtEnd(city, state);
//			return;
//		}			
		
		Node prev, current;
		current = head;
		prev = null;
		//2
		while(current.next != null && index>0) {
			
			prev = current;
			current = current.next;
			index--;			
		}
		
		if(index!=0 && current.next==null) {
			this.insertAtEnd(city, state);
			return;
		}
		
		prev.next = newNode;
		newNode.next = current;
		size++;		
	}
	
	void deleteAtBeginning() {
		
		if(head==null) {
			return;
		}
		
		head = head.next;
		size--;		
		
		if(head==null)
			tail=null;
	}
	
	void deleteAtEnd() {
		
		if(head==null) {
			return;
		}
		
		Node current = head, prev=null;
		
		while(current.next!=null) {
			prev = current;
			current = current.next;
		}
		
		tail = prev;
		if(tail!=null)
			tail.next = null;
		else
			head = null;
		size--;			
	}
	
	void deleteAt(int index) {
		
		if(head==null)
			return;
		
		if(index<=0) {
			this.deleteAtBeginning();
			return;
		}
		
		if(index>=size) {
			this.deleteAtEnd();
			return;
		}
		Node current=head, prev=null;
		
		while(index>0) {
			prev=current;
			current = current.next;
			index--;
		}
		
		prev.next = current.next;
		size--;
	}
	
	public void display() {
		
		Node current = head;
		
		while(current!=null) {
			
			System.out.print(current.city);
			
			if(current.next!=null)
				System.out.print(" -> ");
			current = current.next;
		}
		System.out.println();
	}
}



