package hashing.doubleHashing;

public class HashTable {
	
	Integer table[];
	Boolean status[];
	int size, capacity;
	
	public HashTable(int capacity) {
		size = 0;
		this.capacity = capacity;
		table = new Integer[capacity];
		status = new Boolean[capacity];
	}
	
	private int hash(int val) {
		
		return val%capacity;
	}
	
	private int doubleHash(int val, int c) {
		
		return (hash(val) + c*(7-val%7))%10;
	}
	
	public void insert(int val) {
		
		int initialKey = hash(val);
		int key = initialKey;
		int c=1;
		
		while(table[key]!=null && status[key]==true) {
			
			key = doubleHash(val, c++);
			
			if(key == initialKey) {
				System.out.println("Hash Table is Full");
				return;
			}		
		}
		
		table[key] = val;
		status[key] = true;
		
	}
	
	public int delete(int val) {	
		
		int key = search(val);
		
		if(key == -1)
			return -1;
		
		status[key] = false;
		
		return table[key];
	}	
	public int search(int val) {
		
		int initialKey = hash(val);
		int key = initialKey;
		int c=1;
		
		while(table[key]!=null) {
			
			if(table[key] == val)
				return key;
			
			key = doubleHash(val, c++);
			
			if(key == initialKey) {
				return -1;
			}				
		}
		return -1;
	}
	
	public void display() {
		
		for(int i=0; i<capacity; i++)
			System.out.println(i +" " + table[i] + " " + status[i]);
	}

}
