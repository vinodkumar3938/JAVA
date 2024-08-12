package stack.array;

public class Tester {

	public static void main(String[] args) {
		
		Stack stack = new Stack(5);
		
		System.out.println("Size: " + stack.size());
		
		System.out.println("Is Empty: " + stack.isEmpty());
		
		System.out.println("Is Full: " + stack.isFull());
		
		for(int i=10; i<=50; i+=10)
			stack.push(i);
		System.out.println("Is Full: " + stack.isFull());
		
		System.out.println("Top: " + stack.peek());
		
		System.out.println("Pop: " + stack.pop());
		
		System.out.println("Size: " + stack.size());
		
		System.out.println("Is Empty: " + stack.isEmpty());
		
		System.out.println("Is Full: " + stack.isFull());

		for(int i=0; i<4; i++)
			stack.pop();
		
		System.out.println(stack.peek());
		
		stack.push(3);
		System.out.println(stack.peek());
		
	}

}

