package circularLinkedList;

public class CircularLinkedList {
	
	Node head, tail;
	int size;
	
	void insertAtEnd(String city, String state) {
		
		Node newNode = new Node(city, state);
		
		if(head==null) 
			head = tail = newNode;
		else {
			tail.next = newNode;
			tail = newNode;
		}	
			
		size++;
		tail.next = head;
	}
	
	void insertAtBegin(String city, String state) {
		
		Node newNode = new Node(city, state);
		
		if(head==null) 
			head = tail = newNode;
		else {
			newNode.next = head;
			head = newNode;
		}
		
		tail.next = head;
		size++;
	}
	
	void insertAt(int index, String city, String state) {
		
		Node newNode = new Node(city, state);
		
		if(head==null) {
			head = tail = newNode;
			size++;
			tail.next = head;
			return;
		}
		
		if(index<=0) {
			insertAtBegin(city, state);
			return;
		}
		
		if(index>=size) {
			insertAtEnd(city, state);
			return;
		}
		
		Node current = head, prev = null;
				
		while(index>0) {		
			prev = current;
			current = current.next;
			index--;
		}
		size++;
		prev.next = newNode;
		newNode.next = current;
	}
	
	void deleteAtEnd() {
		
		if(head==null) 
			return;
		
		Node current=head, prev=null;
		
		while(current!=tail) {
			prev = current;
			current = current.next;
		}
		
		tail = prev;
		
		if(tail!=null)
			tail.next = head;
		else
			head = null;
		
		size--;
	
	}
	
	void deleteAtBegin() {
		
		if(head==null) 
			return;
		
		head = head.next;
		size--;
		
		tail.next = head;
		
		if(head==null)
			tail=null;		
	}
	
	void deleteAt(int index) {
		
		if(head==null) 
			return;
		
		if(index<=0) {
			this.deleteAtBegin();
			return;
		}
		
		if(index>=size) {
			this.deleteAtEnd();
			return;
		}
		
		Node current=head, prev=null;
		
		while(index>0) {
			prev = current;
			current = current.next;
			
			index--;
		}
		
		if(prev!=null)
			prev.next = current.next;
		size--;
	}
	
	void traversal() {
		
		if(head==null)
			return;
		
		Node current = head;
		
		do {
			
			System.out.print(current.city);
			
			if(current.next!=head)
				System.out.print(" -> ");
			
			current = current.next;			
		}while(current!=head);
		
		System.out.print(" -> " + current.city);
		System.out.println();
	}
}






