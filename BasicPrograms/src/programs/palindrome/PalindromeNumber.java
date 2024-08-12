package programs.palindrome;

import java.util.Scanner;

public class PalindromeNumber {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number: ");
		int n = sc.nextInt(); // 12321
		int rev = 0;
		int temp = n;
		
		while(n!=0) {
			int rem = n % 10; // 1 , 2, 3, 2, 1
			rev = rev * 10 + rem; // 1, 12, 123, 1232, 12321
			n = n / 10;
		}
		
		if(rev == temp)
			System.out.println(temp + " is a palindrome no.");
		else
			System.out.println(temp + " is not a palindrome no.");

	}

}
