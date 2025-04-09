package Sorting;

public class InsertionSort {
    static void insert(int[] arr) {
        for(int i = 0;i<=arr.length-1;i++) {
            int j = i;
            while(j > 0 && arr[j-1] > arr[j]) {
                int temp = arr[j];
                arr[j] = arr[j-1];
                arr[j-1] = temp;
                j--;
            }
        }
    }
    public static void main(String[] args) {
        int[] arr = {14,9,15,12,6,8,13};

        insert(arr);

        for(int x : arr) {
            System.out.println(x + " ");
        } 
    }
}
