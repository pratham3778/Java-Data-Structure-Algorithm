package CodeRush;
// Question :-
// Counting frequencies of array elements
// Generate an array which may contain duplicates, print all elements and their frequencies
// Input : arr[]={11,25,25,11,25,5,25}
// Output : 11-3, 25-4, 5-1


import java.util.HashMap;
import java.util.Scanner;
import java.util.*;

public class countFreq {
    public static void main(String[] args) {
        //input
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter size of array: ");
        int n = sc.nextInt();
        System.out.print("Enter array: ");
        int[] arr = new int[n];
        for(int i=0;i<n;i++) {
            arr[i] = sc.nextInt();
        }

        //find freq
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int i=0;i<n;i++) {
            map.put(arr[i], map.getOrDefault(arr[i], 0)+1);
        }

        //print
        for(Map.Entry<Integer, Integer> entry : map.entrySet()) {
            System.out.println(entry.getKey() + " " + entry.getValue());
        }
    }
}
