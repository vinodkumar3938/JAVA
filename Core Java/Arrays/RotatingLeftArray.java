public class RotatingLeftArray {
    public static void main(String[] args) {
        int A[] = {2,4,6,8,10,12,14,16,18,20};
        int temp = A[0];

        for(int i=0;i<A.length;i++)
        {
            System.out.print(A[i] + " ,");
        }
        System.out.println("");

        for(int i=1;i<A.length;i++)
        {
            A[i-1] = A[i];
        }
        A[A.length-1] = temp;

        for(int x : A)
        {
            System.out.print(x + " ,");
        }
    }
}
