package hashing;

//import hashing.linearProbing.HashTable;
//import hashing.quadraticProbing.HashTable;
//import hashing.doubleHashing.HashTable;
import hashing.chaining.HashTable;

public class Tester {

	public static void main(String[] args) {

		HashTable table = new HashTable(10);
		
		table.display();
		
		table.insert("java");
		table.insert("python");
		table.insert("react");
		table.insert("javascript");
		
		table.insert("ajva");
		table.insert("avja");
		table.insert("vjaa");
		table.display();
//		table.insert(115);
//		table.insert(42);
//		table.insert(97);
//		table.insert(63);
//		table.insert(88);
//		table.insert(52);
//		
//		table.insert(112);
//		
//		table.display();
//		
//		System.out.println();
//		System.out.println("Search 52: " + table.search(52));
//		System.out.println("Search 72: " + table.search(72));
//		
//		table.delete(52);
//		System.out.println();
//		table.display();
//		System.out.println("Search 112: " + table.search(112));
//		
//		
		
	}

}
