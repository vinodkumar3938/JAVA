package sortingAlgorithms;

import java.util.Arrays;

public class InsertionSort {
	public static void main(String[] args) {
		int arr[] = {45,29,8,12,37};
		insertion(arr);
		System.out.println(Arrays.toString(arr));
	}
	
	
	static void insertion(int[] arr) {
		for(int i=1;i<arr.length;i++) {
			for(int j=i;j>0;j--) {
				if(arr[j] < arr[j-1]){ 
                    swap(arr,j,j-1);
                }
			}
		}
	}
	
	static void swap(int[] arr,int first,int second) {
		
		int temp = arr[first];
		arr[first] = arr[second];
		arr[second] = temp;
	}
}
