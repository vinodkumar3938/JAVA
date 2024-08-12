package queue.array;

public class Tester {

	public static void main(String[] args) {

		Queue queue = new Queue(5);
		
		System.out.println("Size: " + queue.size());
		System.out.println("IsFull: " + queue.isFull());
		System.out.println("IsEmpty: " + queue.isEmpty());
		
		
		queue.enQueue(10);
		
		System.out.println("Front: " + queue.front());
		System.out.println("Rear: " + queue.rear());
		
		queue.enQueue(20);
		
		System.out.println("Front: " + queue.front());
		System.out.println("Rear: " + queue.rear());

		queue.enQueue(30);
		queue.enQueue(40);
		queue.enQueue(50);
		
		System.out.println("Front: " + queue.front());
		System.out.println("Rear: " + queue.rear());
		
		queue.enQueue(60);
		
		System.out.println("Front: " + queue.front());
		System.out.println("Rear: " + queue.rear());
		System.out.println("Size: " + queue.size() + " Capacity: " + queue.getCapacity());
	
		System.out.println("DeQueue: " + queue.deQueue());
		
		queue.enQueue(60);
		System.out.println("Front: " + queue.front());
		System.out.println("Rear: " + queue.rear());
		System.out.println("Size: " + queue.size() + " Capacity: " + queue.getCapacity());
	
		System.out.println("IsFull: " + queue.isFull());
		
		for(int i=0; i<5; i++) {
			queue.deQueue();
		}
		
		System.out.println("IsEmpty: " + queue.isEmpty());


	}

}
