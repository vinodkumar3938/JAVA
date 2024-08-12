package heap;

public class MaxHeap {
	
	private int size, capacity;
	private int heap[];
	
	public MaxHeap(int capacity) {
		
		this.capacity = capacity;
		this.size = 0;
		this.heap = new int[capacity];
	}
	
	public void insert(int val) {
		
		//append
		heap[size++] = val;
		
		//heapify - child{p} > parent{p/2} - stop 1
		
		int childPos = size;
		int parentPos;
		
		while(childPos > 1) {		
			
			parentPos = childPos/2;
			
			if(heap[childPos-1] > heap[parentPos-1])
				swap(childPos-1, parentPos-1);
			
			childPos = parentPos;
		}
	}
	
	public void delete() {
		
		//swap(0, size-1)
		//heapify - parent - left, right stop size
		
		if(size==0)
			return;
		
		swap(0, size-1);
		size--;
		
		int parentPos = 1;
		int max = 0;
		int leftPos , rightPos;
		boolean flag = false;
				
		while(parentPos < size) {		
			
			leftPos = parentPos*2;
			rightPos = parentPos*2 + 1;
			max = leftPos;
			
			if(leftPos<=size && heap[max-1] > heap[parentPos-1]) {
				max = leftPos;
				flag = true;
			}
			
			if(rightPos<=size && heap[rightPos-1] > heap[max-1]) {
				max = rightPos;
				flag = true;
			}
			
			if(flag) {
				swap(max-1, parentPos-1);
				parentPos = max;
				flag = false;
			}
			else {
				return;
			}
		}
	}
	
	private void swap(int child, int parent) {
		
		int temp = heap[child];
		heap[child] = heap[parent];
		heap[parent] = temp;
	}
	
	public int getMax() {
		
		return size==0? -1: heap[0];
	}
	
	public int getSize() {
		
		return size;
	}
	
	public void display() {
		
		for(int n: heap)
			System.out.print(n + " ");
		System.out.println();
	}

}
