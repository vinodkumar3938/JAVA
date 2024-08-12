package hashing.linearProbing;

//import java.util.Arrays;


 public class HashTable{
	 Integer table[];
	 int size,capacity;
	 Boolean status[];
	 
	 public HashTable(int capacity) {
		 this.capacity = capacity;
		 size = 0;
		 table = new Integer[capacity];
		 status = new Boolean[capacity];
	 }
	 
	public int hash(int key) {
		 return key%capacity;
	}
	 
	public void insert(int val) {
		//find key
		int initialkey = hash(val);
		int key = initialkey;
		
		//collision handling
		while(table[key]!=null && status[key]!=false) {
			key = hash(key+1);
			if(initialkey == key) {
				System.out.println("Hash Table is full");
				return;
			}
		}
		table[key] = val;
		status[key] = true;
	}
	
	public int search(int val) {
		int initialkey = hash(val);
		int key = initialkey;
		while(table[key]!=null && status[key]!=null) {
			if(status[key]==true && table[key] == val) {
				return key;
			}
			key = hash(key+1);
			if(initialkey == key)
				return -1;
		}
		return -1;
	}
	
	public int delete(int val) {
		int key = search(val);
		if(key == -1)
			return -1;
		status[key] = false;
		return table[key];
	}
	
	public void display() {
		for(int i=0;i<capacity;i++) {
			System.out.println(i + " " + table[i] + " " + status[i]);
		}
	}
 }