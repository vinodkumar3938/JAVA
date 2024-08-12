package exceptionHandling.finallydemo;

public class FinallyDemo {
	public static void main(String[] args) {
		try {
			System.out.println(10/0);
		}
		/*
		 * Exception in try - goto catch later goto finally
		 * No Exception in try - directly goes to finally.
		 * if only try and catch block there
		 * 	 -> Try with exception - prints finally content first, later prints exception.
		 *   -> Try with no exception - prints try 1st later finally. 
		 */
		catch(ArithmeticException e) {
			System.out.println("Exception Is : " + e);
		}
		finally {
			System.out.println("Final Message");
		}
	}
	
}
