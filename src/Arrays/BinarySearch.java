package Arrays;
// This is binary search algorithm
public class BinarySearch {

    public static int search_(int[] array, int num) {

        int right = array.length-1;
        int left = 0;

        while (left <= right) {
            int mid = (right + left)/2;
           if(num == array[mid]){
               System.out.println("Element is found at the index: " + mid);
               return mid;
           }

           else if (num < array[mid]){
               right = mid - 1;
           }

           else {
               left = mid + 1;
           }
        }
        System.out.println("The element you are looking for could not be found");
        return -1;
    }
    public static void main(String[] args) {
        int[] array = {2,3,4,5,6,7,8,9,10};
        BinarySearch search = new BinarySearch();
        search.search_(array,9);

    }
}
