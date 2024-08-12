package DSA_USING_JAVA_WITH_KUNAL.SortingAlgorithms;
import java.util.*;

public class CyclicSort {
    public static void main(String[] args) {
        int[] arr = {3,5,2,1,4};
        sort(arr);
        System.out.println(Arrays.toString(arr));
    }

    static void sort(int[] arr){
        int i =0;
        while(i < arr.length){ // i = 0 1 2 3 4
            int correctIndex = arr[i] - 1; // 3-1 = 2
            if(arr[i] != correctIndex) { // 3 != 0
                swap(arr,i,correctIndex);
            }
            else{
                i++;
            }
        }
    }
    static void swap(int[] arr,int first,int second){
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }
}
