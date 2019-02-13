package Sorting;

import java.util.Arrays;

public class BubbleSort {

    // Utility function to swap values at two indices in the array
    public static void swap(int arr[], int i, int j){
        int temp = arr[i];

        arr[i] = arr[j];
        arr[j] = temp;


    }
    // function to perform bubble sort on arr[]
    public static void bubbleSort(int arr[]){
        // (arr.length - 1) pass
        for (int k = 0; k < arr.length-1; k++){

            // last k items are already sorted, so inner loop can
            // avoid looking at the last k items
            for (int i = 0; i < arr.length-1-k; i++){
                if (arr[i] > arr[i + 1]){
                    swap(arr,i,i+1);
                }
            }
            // the algorithm can be stopped if the inner loop did not do any swap
        }
    }

    public static void main(String[] args) {
        int arr[] = {1,3,0,98,6,4,2,0,37};
        bubbleSort(arr);

        // print the sorted array
        System.out.println(Arrays.toString(arr));
    }
}
