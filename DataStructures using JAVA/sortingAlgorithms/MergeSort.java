package sortingAlgorithms;

import java.util.Arrays;

public class MergeSort {
	
	public static void main(String[] args) {
        int[] arr = {9, 4, 7, 3, 1, 6, 5, 8, 2};
        mergeSort(arr);
        
//        for (int i : arr)
//            System.out.print(i + " ");
        
        System.out.println(Arrays.toString(arr));
        
    }

    public static void mergeSort(int[] arr) {
        int n = arr.length;
        if (n <= 1) {
            return;
        }
        int mid = n / 2;
        int[] left = new int[mid];
        int[] right = new int[n - mid];

        // Divide the array into two halves
        for (int i = 0; i < mid; i++) {
            left[i] = arr[i];
        }
        for (int i = mid; i < n; i++) {
            right[i - mid] = arr[i];
        }

        // Recursively sort the two halves
        mergeSort(left);
        mergeSort(right);

        // Merge the sorted halves
        merge(arr, left, right);
    }

    public static void merge(int[] array, int[] leftArray, int[] rightArray) {
        int i = 0, j = 0, k = 0;
        while (i < leftArray.length && j < rightArray.length) {
        	
            if (leftArray[i] <= rightArray[j]) {
                array[k++] = leftArray[i++];
            } else {
                array[k++] = rightArray[j++];
            }
        }
        
        //adding leftovers
        while (i < leftArray.length)
            array[k++] = leftArray[i++];
        
        while (j < rightArray.length)
            array[k++] = rightArray[j++];
        
    }

    
}


