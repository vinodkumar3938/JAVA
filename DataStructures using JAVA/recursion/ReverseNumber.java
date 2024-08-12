package recursion;

public class ReverseNumber {
    public static void main(String[] args) {
        int num = 12345;
        int revNum = reverseNumber(num);
        System.out.println("Original number: " + num);
        System.out.println("Reversed number: " + revNum);
    }

    public static int reverseNumber(int num) {
        return Recursion(num, 0);
    }

    public static int Recursion(int num, int reversedNum) {
        if (num == 0) {
            return reversedNum;
        }
        reversedNum = reversedNum * 10 + num % 10;
        return Recursion(num / 10, reversedNum);
    }
    
}

