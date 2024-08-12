package multiThreading;

public class ThreadUsing1Class extends Thread {
	
	public void run() {
		int i=1;
		while(true){
			System.out.println(i + "Hello");
			i++;
		}
	}
	
	public static void main(String[] args) {
		ThreadUsing1Class t = new ThreadUsing1Class();
		t.start();
		int i = 1;
		while(true){
			System.out.println(i + "World");
			i++;
		}
	}
}
