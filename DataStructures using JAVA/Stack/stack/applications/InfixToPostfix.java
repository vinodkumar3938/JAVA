package stack.applications;

import java.util.Scanner;
import java.util.Stack;

public class InfixToPostfix {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the infix: ");
		String infix = scan.next();
		
		InfixToPostfix con = new InfixToPostfix();
		
		String postfix = con.conversion(infix);
		
		System.out.println(postfix);
		
		scan.close();
	}
	
	String conversion(String infix) {
		
		Stack<Character> stack = new Stack<>();
		
		StringBuilder postfix = new StringBuilder();
		
		for(char ch : infix.toCharArray()) {
			
			if(Character.isLetterOrDigit(ch))
				postfix.append(ch);
			
			else if(ch=='(')
				stack.push(ch);
			
			else if(ch==')') {
				
				while(!stack.isEmpty() && stack.peek()!='(') {
					postfix.append(stack.pop());
				}
				
				stack.pop();		
			}			
			else {
				while(!stack.isEmpty() && precedence(ch) <= precedence(stack.peek())) {
					postfix.append(stack.pop());
				}
				stack.push(ch);
			}			
		}
		
		while(!stack.isEmpty()) {
			postfix.append(stack.pop());
		}
		
		return postfix.toString();
	}
	
	int precedence(char ch) {
		
//		return switch(ch) {
//		case '+', '-' -> 1;
//		case '*', '/' -> 2;
//		default -> -1;
//		};
		
		switch(ch) {
		case '+', '-':
			return 1;
		case '*', '/':
			return 2;
		}
		
		return -1;	
		
	}

}
