package Sorting;

import java.util.Arrays;

public class InsertionSort {
    //function to perform insertion sort on arr[]
    public static void insertionSort(int[] arr){
        // start from the second element (element at index 0 is already sorted)
        for(int i = 1; i < arr.length ; i++){
            int value = arr[i];

            // find the the index i within the sorted subset where a new element arr[i] belongs
            while ( i > 0 && arr[i-1] > value){
                arr[i] = arr[i-1];
                i--;
            }
            arr[i] = value;
        }

    }


    public static void main(String[] args) {
        int[] arr = {1,5,7,0,9,5,8,2};
        insertionSort(arr);

        System.out.println(Arrays.toString(arr));
    }
    }

