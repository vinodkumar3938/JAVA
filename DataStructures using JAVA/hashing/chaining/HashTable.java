package hashing.chaining;

public class HashTable {

	int size, capacity;
	Node table[];
	
	public HashTable(int capacity) {
		this.capacity = capacity;
		size = 0;
		table = new Node[capacity];
	}
	
	private int hash(String val) {
		
		int hashKey = 0;
		
		for(char ch: val.toCharArray())
			hashKey += ch;
		
		return hashKey % capacity;
		//return val.hashCode()%capacity;
		//return val.length()%capacity;
	}
	
	public void insert(String val) {
		
		Node newNode = new Node(val);
		int key = hash(val);
		
		if(table[key]==null)
			table[key] = newNode;
		
		else {
			Node current = table[key];
			Node prev = null;
			
			while(current!=null && val.compareTo(current.val) > 0) {
				prev = current;
				current = current.next;
			}
			
			if(prev==null) {
				newNode.next = table[key];
				table[key] = newNode;
				return;
			}
			
			prev.next = newNode;
			newNode.next = current;
		}
		
		
		
	}
	
	public int delete(String val) {
		
		return -1;
	}
	
	public int search(String val) {
		
		int key =  hash(val);
		
		if(table[key] == null)
			return -1;
		
		Node current = table[key];
		
		while(current!=null && !table[key].val.equals(val)) {
			current = current.next;
		}
		return current!=null?key:-1;

	}
	
	public void display() {
		for(int i=0; i<capacity; i++) {
			
			System.out.print(i + " ");
			
			if(table[i]==null)
				System.out.print("null");
			else {
				
				Node current = table[i];
				
				while(current!=null) {
					System.out.print(current.val);
					if(current.next!=null)
						System.out.print(" -> ");
					current = current.next;
				}					
			}				
			System.out.println();
		}
		System.out.println();
			
	}
}
