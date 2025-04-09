package Sorting;

public class BubbleSort {
    static void bubble(int[] arr) {
        for(int i=arr.length-1;i>=1;i--){
            for(int j=0;j<=i-1;j++) {
                if(arr[j] > arr[j+1]) {
                    int temp = arr[j+1];
                    arr[j+1] = arr[j];
                    arr[j] = temp;
                }
            }
        }
    }
    public static void main(String[] args) {
        int arr[] = {13,24,46,52,20,9};

        bubble(arr); //Call bubble sort

        for(int x : arr){
            System.out.println(x +" ");
        }
    }
}
