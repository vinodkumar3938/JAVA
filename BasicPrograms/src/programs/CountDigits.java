package programs;

//count digits of a number
import java.util.*;
public class CountDigits{
  public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      System.out.println("enter a number : ");
      int n = sc.nextInt(); //1634
      int count = 0;

      while(n!=0) // 1634!=0 , 163!=0
      {
          n = n/10; //163 , 16
          count += 1; // 1 , 2
      }
      System.out.println("count of given number is : " + count);
  }
}
