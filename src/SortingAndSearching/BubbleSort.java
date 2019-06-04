package SortingAndSearching;

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
        for ( int i = 0; i < arr.length - 1; i++){
            for ( int j = i + 1; j < arr.length; j++){
                if (arr[j] < arr[i]){
                    swap(arr, i, j);
                }
            }
        }
    }

    public static void main(String[] args) {
        int arr[] = {1,3,0,98,6,4,2,0,37};
        bubbleSort(arr);

        // print the sorted array
        System.out.println(Arrays.toString(arr));
    }
}
