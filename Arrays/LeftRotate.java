package Arrays;

import java.util.Arrays;

public class LeftRotate {
    //left rotate array by one place
    public static int[] leftR(int arr[], int n) {
        int temp = arr[0];
        for(int i=0;i<n-1;i++) {
            arr[i] = arr[i+1];
        }
        arr[n-1] = temp;
        return arr;
    }

    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5};
        int n = 5;

        leftR(arr, n);
        System.out.println(Arrays.toString(arr));
    }
}

