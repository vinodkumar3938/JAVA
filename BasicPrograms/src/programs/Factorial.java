package programs;


//factorial of a number
import java.util.*;

public class Factorial {
  public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      System.out.println("enter any number : ");
      int n = sc.nextInt(); // 5
      long fact = 1;

      for (int i = 2; i <= n; i++) {
          fact = fact * i; // 1 * 2 * 3 * 4 * 5
      }
      System.out.println("Factorial of " + n + " is : " + fact);
  }
}

