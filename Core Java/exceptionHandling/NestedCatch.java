package exceptionHandling;

public class NestedCatch {
	public static void main(String[] args) {
		int a[] = {30,20,10,40,0};
		
//		int c = a[0] / a[4];
//		System.out.println("Divison is : " + c); //exception arises here
//		System.out.println(a[10]); //exception arises here
//		/*
//		Exception in thread "main" java.lang.ArithmeticException: / by zero
//		at exceptionHandling.NestedCatch.main(NestedCatch.java:6)		
//		 */
		
		//handling exception
		try {
			int c = a[0] / a[2];
			System.out.println("Divison is : " + c);
			
			try 
			{
				System.out.println(a[10]);
			}
			
			catch(ArrayIndexOutOfBoundsException e) {
				System.out.println("Index is Invalid");
			}
			
		}
		
		catch(ArithmeticException e) 
		{
			System.out.println(e); //displays exception
			System.out.println("Denominator should not be 0, try again");
		}
		
		System.out.println("Bye");
	}
}
