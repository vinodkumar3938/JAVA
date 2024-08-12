package heap;

public class Tester {

	public static void main(String[] args) {

		int array[] = {15, 24, 10, -48, 39, 51, 37, 1, 8, 20};
		
		MaxHeap heap = new MaxHeap(array.length);
		
		for(int num: array) {
			heap.insert(num);		
			System.out.println(num + " " + heap.getMax());
		}
		
		heap.display();		
		
		for(int i=0; i<array.length; i++)
			heap.delete();
		
		heap.display();
		
		

	}

}
