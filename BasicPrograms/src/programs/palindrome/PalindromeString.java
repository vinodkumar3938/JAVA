package programs.palindrome;

import java.util.Scanner;

public class PalindromeString {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a string: ");
		String input = sc.nextLine(); //MADAM
		
		if(isPalindrome(input))
			System.out.println(input + " is a palindrome");
		else
			System.out.println(input + " is not a palindrome");
	}

	public static boolean isPalindrome(String str) {
		
		String cleaned = str.replaceAll("[^A-Za-z0-9]", "").toLowerCase();
		
		int left = 0;
		int right = cleaned.length() - 1;
				
		while(left < right) {
			if(cleaned.charAt(left) != cleaned.charAt(right))
				return false;
			left++;
			right--;
		}
		return true;
	}
}
