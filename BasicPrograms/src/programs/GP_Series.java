package programs;

// a , ar , ar^2 , ar^3 : 2 , 6 , 18 , 54

import java.util.Scanner;
public class GP_Series {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Display GP Series");
		System.out.println("Enter n , a , r value: ");
		int n = sc.nextInt(); //10
		int a = sc.nextInt();
		int r = sc.nextInt();
		
		for(int i=0; i<=n; i++) {
			System.out.print(a + " ");
			a = a * r;
		}
		
	}
}
