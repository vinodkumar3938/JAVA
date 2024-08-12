package programs;

import java.util.Scanner;

public class ReverseString {
    public static void main(String[] args) {
    	
        // Create a Scanner object to take input from the user
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string to reverse:");
        String input = sc.nextLine(); // vinod

        // Reverse the string manually
        String reversed = "";
        for (int i = input.length() - 1; i >= 0; i--) {
            reversed += input.charAt(i);
        }

        // Print the reversed string
        System.out.println("Reversed string: " + reversed);
    }
}

