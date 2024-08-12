package programs;

//Reverse of a number
import java.util.*;

public class ReverseNumber {
  public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      System.out.println("enter a number: ");
      int n = sc.nextInt();
      int rev = 0;
      int temp = n;


      while(n!=0)
      {
          int rem = n%10;
          rev = rev*10 + rem;
          n = n/10;
      }
      System.out.println("Reverse of " + temp + " is " + rev);
  }
}

