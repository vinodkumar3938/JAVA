package sortingAlgorithms;
import java.util.Scanner;

public class BubbleSort {
public static void main(String[]args) {
	Scanner sc =new Scanner(System.in);
	System.out.println("Enter the array elements : ");
	int n=sc.nextInt();
	int a[]=new int[n];
	for (int i=0;i<n;i++)
{
		a[i]=sc.nextInt();
		}
	
	int temp=0;
	for (int i=n-1;i>0;i--) {
		for(int j=0;j<i;j++) {
			if(a[j]>a[j+1]) 
			{
				temp=a[j];
				a[j]=a[j+1];
				a[j+1]=temp;
			}
		}
	}
	for(int i=0;i<n;i++) {
	System.out.print(a[i] + " ");
	
	}
	sc.close();
}
}