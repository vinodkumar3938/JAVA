package exceptionHandling;

public class ExceptionDemo {
	public static void main(String[] args) {
		int a=10, b=0, c;
//		c = a/b; //Exception arises here
//		/*
//		 * Exception in thread "main" java.lang.ArithmeticException: / by zero
//	at exceptionHandling.ExceptionDemo.main(ExceptionDemo.java:6)
//		 */
//		System.out.println(c);
//		System.out.println("Bye");
		
		try {
			c = a/b;
			System.out.println("Divison is : " + c);	
		}
		
		catch(ArithmeticException e){
			System.out.println(e); //displays exception
			System.out.println("Denominator should not be 0, try again");
		}
		System.out.println("Bye");
	}

}
