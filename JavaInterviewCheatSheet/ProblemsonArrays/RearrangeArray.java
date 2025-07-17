package JavaInterviewCheatSheet;

import java.util.Arrays;

public class RearrangeArray {
    static void rearr(int[] arr) {
        Arrays.sort(arr);

        for(int i=0;i<arr.length/2;i++) {
            System.out.println(arr[i] + " ");
        }

        for(int i=arr.length-1;i>=arr.length/2;i--) {
            System.out.println(arr[i] + " ");
        }
    }
    public static void main(String[] args) {
        int[] arr = {8,7,1,6,5,9};
        rearr(arr);
    }
}
