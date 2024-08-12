package programs;

import java.util.Scanner;
public class FibonacciSeries {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter n value: ");
		int n = sc.nextInt(); //10
		int a = 0 , b = 1, c;
		
		System.out.print(a + " ");
		System.out.print(b + " ");
		
		for(int i=3; i<=n; i++) {
			c = a + b;
			System.out.print(c + " ");
			a = b; 
			b = c;
			
		}
	}
}
