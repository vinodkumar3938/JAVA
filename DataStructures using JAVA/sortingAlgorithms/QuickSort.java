package sortingAlgorithms;

public class QuickSort {
    public static void main(String[] args) {
        int[] arr = {29, 10, 14, 37, 13}; // Example array to sort
        quickSort(arr, 0, arr.length - 1);

        // Printing the sorted array
        for (int num : arr) {
            System.out.print(num + " ");
        }
    }

    public static void quickSort(int[] arr, int low, int high) {
        if (low < high) {
            int pi = partition(arr, low, high);

            quickSort(arr, low, pi - 1); // Sort elements before partition
            quickSort(arr, pi + 1, high); // Sort elements after partition
        }
    }

    public static int partition(int[] arr, int low, int high) {
        int pivot = arr[low];
        int i = low;

        for (int j = low + 1; j <= high; j++) {
            if (arr[j] < pivot) {
                i++;
                swap(arr, i, j);
            }
        }

        swap(arr, low, i);

        return i;
    }

    public static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}

