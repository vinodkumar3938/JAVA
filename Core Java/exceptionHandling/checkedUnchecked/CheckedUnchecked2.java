package exceptionHandling.checkedUnchecked;

class LowBalanceException extends Exception{
	
	// LowBalanceException : here we defined our own exception class
	
	public String toString() { // overiding toString method
		return "Balance should not be < 5000";
	}
}

public class CheckedUnchecked2 {
	
	static void fun1() {

		try {
			throw new LowBalanceException(); //creates an obj for LowBalanceException and throws an exception
		}
		
		catch(LowBalanceException e){
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


