package programs;

import java.util.Scanner;

public class AP__Series {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("AP Series"); // 2,5,8,11,14,17,20,23,26,29
		System.out.println("Enter values of n,a,d : ");
		
		int n = sc.nextInt();
		int a = sc.nextInt();
		int d = sc.nextInt();
		int temp = a;
		
		for(int i=0; i<n; i++) {
			System.out.print(temp + ",");
			temp = temp + d;
		}
	}
}

