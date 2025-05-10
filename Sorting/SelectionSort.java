package Sorting;

// pick the smallest (from unsorted) put it at the begining , take a min posi
// tc : 0(n^2)
public class SelectionSort {
    public static void sele(int[] arr) {
        // Loop through the array
        for (int i = 0; i < arr.length - 1; i++) {
            int min = i;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] < arr[min]) {
                    min = j; 
                }
            }
            int temp = arr[i];
            arr[i] = arr[min];
            arr[min] = temp;
        }
    }
    public static void main(String[] args) {
        int[] arr = {9, 11, 2, 3, 1};

        sele(arr);  // Call the selection sort

        // Print the sorted array
        for (int num : arr) {
            System.out.print(num + " ");
        }
    }
}
