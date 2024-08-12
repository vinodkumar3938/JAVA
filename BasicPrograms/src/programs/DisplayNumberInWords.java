package programs;


//Display Number in words
import java.util.Scanner;

public class DisplayNumberInWords {
  /**
   * @param args
   */
  public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      System.out.println("enter any number : ");
      int n = sc.nextInt(); // 1634
      String str = "";

      while (n != 0) {
          int rem = n % 10; // 4
          str = str + rem; // "4"
          n = n / 10; // 163
      }
      System.out.println(str); // "4361"

      char c;
      for (int i = str.length() - 1; i >= 0; i--) // i = str[4-1] = 1
      {
          c = str.charAt(i); // c = 1

          switch (c) {
              case '0':
                  System.out.print("Zero ");
                  break;
              case '1':
                  System.out.print("one ");
                  break;
              case '2':
                  System.out.print("two ");
                  break;
              case '3':
                  System.out.print("three ");
                  break;
              case '4':
                  System.out.print("four ");
                  break;
              case '5':
                  System.out.print("five ");
                  break;
              case '6':
                  System.out.print("six ");
                  break;
              case '7':
                  System.out.print("seven ");
                  break;
              case '8':
                  System.out.print("eight ");
                  break;
              case '9':
                  System.out.print("Nine ");
                  break;

          }
      }
  }
}

