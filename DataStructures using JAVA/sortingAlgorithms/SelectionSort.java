package sortingAlgorithms;


import java.util.Scanner;

public class SelectionSort {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("enter the elements of array");
		int n= scan.nextInt();
		int arr[] = new int[n];
		for(int i=0;i<n;i++) {
			arr[i]=scan.nextInt();	
		}
		
			int temp=0;
			int minindex=-1;
			for(int i=0;i<n;i++) {
				minindex=i;
				for(int j=i+1;j<n;j++) {
					if (arr[minindex] > arr[j]) {
						minindex=j;
						
					}
				
				
				temp=arr[minindex];
				arr[minindex]=arr[i];
				arr[i]=temp;
			}
			
			}
			for(int ele : arr) {
				
				System.out.print(ele + " ");
				
			}
			scan.close();
			          
			

	}

}