package Strings;

// Given an array of integers, find three numbers whose product is the maximum and
// output the maximum product

import java.util.Arrays;

public class MaxProduct {

    public static void swap(int arr[], int i, int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;

    }
    // function to perform bubble sort on arr[]
    public static void sort(int arr[]){
        for ( int i = 0; i < arr.length-1; i++){
            for ( int j = i + 1; j < arr.length; j++){
                if (arr[j] < arr[i]){
                    swap(arr, i, j);
                }
            }
        }
    }

    public static void findProduct(int[] a){
        sort(a);
        int x = a.length-1;
        int y = a.length-2;
        int z = a.length-3;
        System.out.println(a[x]);
        System.out.println(a[y]);
        System.out.println(a[z]);

        int sum = a[x]*a[y]*a[z];
        System.out.println("The product is " + sum);
    }
    public static void main(String[] args) {
        int[] a = {1,6,8,9,4,5,7};
        findProduct(a);
    }
}
