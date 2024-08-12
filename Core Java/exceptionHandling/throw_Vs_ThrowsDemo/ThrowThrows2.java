package exceptionHandling.throw_Vs_ThrowsDemo;

class NegativeDimensionException extends Exception{
	
	public String toString() {
		return "Dimension of a rectangle cannot be negative";
	}
}
public class ThrowThrows2 {
	
// using own class exception(ex: NegativeDimensionException) instead of using built-in class(Exception)
	static int area(int l, int b) throws NegativeDimensionException{
		
		if(l<=0 || b<=0)
			throw new NegativeDimensionException();
		return l*b;
	}
	
	static void meth1() throws NegativeDimensionException{
		System.out.println("Area is : " + area(-10,5));
	}
	
	public static void main(String[] args) {
		
		try {
			meth1();
		}
		catch(NegativeDimensionException e) {
			System.out.println("Exception is: " + e);
		}
	}

}
