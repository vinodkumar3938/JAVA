package exceptionHandling.checkedUnchecked;

public class CheckedUnchecked {
	
	static void fun1() {
		/*
		 *  unchecked exception : will not throw any error
			System.out.println(10/0);
		 */
		
		// handling exception
		try {
			System.out.println(10/0);
		}
		
		catch(Exception e){
			//Exception e : Mother class for all exceptions. So this will handle every exception.
			System.out.println(e);
			System.out.println(e.getMessage());
			e.printStackTrace();
		}	
	}
	
	static void fun2() {
		fun1();
	}
	
	static void fun3() {
		fun2();
	}
	
	public static void main(String [] args) {
		fun3();
	}
}

