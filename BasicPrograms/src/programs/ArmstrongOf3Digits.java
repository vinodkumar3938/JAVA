package programs;

import java.util.*;

public class ArmstrongOf3Digits {
	
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a number: ");
        int n = sc.nextInt(); // 153
        int sum = 0;
        int temp = n;

        while (n != 0) {
            int rem = n % 10;
            sum = sum + rem * rem * rem;
            n = n / 10;
        }
        if (temp == sum) {
            System.out.println(temp + " is " + "an Armstrong number");
        } else {
            System.out.println(temp + " is " + " not an Armstrong number");
        }

    }
}
