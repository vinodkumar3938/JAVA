package exceptionHandling.throw_Vs_ThrowsDemo;

// we should not calculate area if dimensions (length or breadth) are -ve , so handle an exception if dim are -ve. 
public class ThrowThrows1 {
	
	static int area(int l, int b) throws Exception{
		
		if(l<=0 || b<=0)
			throw new Exception();
		return l*b;
	}
	
	static void meth1() throws Exception{
		System.out.println("Area is : " + area(-10,5));
	}
	
	public static void main(String[] args) {
		try{
			meth1();
		}
		catch(Exception e) {
			System.out.println("Exception is : " + e);
		}
	}
}
