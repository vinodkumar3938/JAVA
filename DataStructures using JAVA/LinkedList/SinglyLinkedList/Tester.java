package SinglyLinkedList;

public class Tester {

	public static void main(String[] args) {

		SinglyLinkedList sll = new SinglyLinkedList();
		
		sll.insertAtEnd("Chennai", "TN");
		sll.insertAtEnd("Hyderabad", "TL");
		sll.insertAtEnd("Bangalore", "KT");
		sll.insertAtEnd("Mumbai", "MH");
		
		sll.display();
		
		sll.insertAtBeginning("Kochin", "KR");
		sll.insertAtBeginning("Allapey", "KR");
		
		sll.display();
		
		sll.insertAt(2, "Goa", "Goa");
		
		sll.display();
		System.out.println("Size: " + sll.size);
		
		
		sll.insertAt(7, "Delhi", "Delhi");
		sll.display();
		
		sll.insertAt(0, "Ooty", "TN");
		sll.display();
		System.out.println("Size: " + sll.size);
		
		sll.insertAt(87, "Lucknow", "UP");
		sll.display();
		System.out.println("Size: " + sll.size);
				
		for(int i=1; i<10; i++)
			sll.deleteAtBeginning();
		
		sll.display();
		System.out.println("Size: " + sll.size);
		
		System.out.println(sll.head.city + " " + sll.tail.city);
		sll.deleteAtBeginning();
		sll.display();
		
		System.out.println("Head: " + sll.head + " Tail: " + sll.tail);
				
		sll.insertAtEnd("Chennai", "TN");
		sll.insertAtEnd("Hyderabad", "TL");
		sll.insertAtEnd("Bangalore", "KT");
		sll.display();
		
		sll.deleteAtEnd();
		sll.display();
		
		sll.deleteAtEnd();
		sll.deleteAtEnd();
		sll.display();
		
		System.out.println("Head: " + sll.head + " Tail: " + sll.tail);
		
		sll.insertAtEnd("Chennai", "TN");
		sll.insertAtEnd("Hyderabad", "TL");
		sll.insertAtEnd("Bangalore", "KT");
		sll.insertAtEnd("Mumbai", "MH");
		sll.display();
		
		sll.deleteAt(2);
		sll.display();
		
		sll.deleteAt(0);
		sll.display();
		
		sll.deleteAt(5);
		sll.display();
		
		sll.deleteAt(78);
		sll.display();
	}
}

