package multiThreading;

public class RunnableWith1Class implements Runnable {
	
	public void run() {
		int i=1;
		while(true){
			System.out.println(i + "Hello");
			i++;
		}
	}
	
	public static void main(String[] args) {
		RunnableWith1Class m = new RunnableWith1Class();
		Thread t = new Thread(m);
		t.start();
		int i = 1;
		while(true){
			System.out.println(i + "World");
			i++;
		}
	}
}
