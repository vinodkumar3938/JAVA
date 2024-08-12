package programs;

//Armstrong number
/* 
An Armstrong number is a number that is equal to the sum of its own digits each raised to the power of the number of digits.

For example, 
371 is an Armstrong number : 3**3 + 7**3 + 1**3 = 371

1634 is an Armstrong number : 1**4 + 6**4 + 3**4 + 4**4 = 1634
*/

import java.util.Scanner;

public class ArmstrongOfAnyNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt(); //1634
        sc.close();

        if (isArmstrong(num)) {
            System.out.println(num + " is an Armstrong number.");
        } else {
            System.out.println(num + " is not an Armstrong number.");
        }
    }

    public static boolean isArmstrong(int num ) { // num = 1634
        int originalNumber = num;
        int sum = 0;
        int numberOfDigits = String.valueOf(num).length();

        while (num != 0) {
            int rem = num % 10;
            sum += Math.pow(rem, numberOfDigits);
            num /= 10;
        }

        return sum == originalNumber;
    }
}

