package Sorting;

// This is a binary search on a sorted array. First, I check if the array is null or empty. 
// Then I set two pointers — left at 0 and right at the last index. 
// I run a loop while left <= right, calculate mid, and check if arr[mid] is equal to the key — that’s my base case.
// If the key is smaller, I search the left half by setting right = mid - 1. 
// If it's bigger, I search the right half by setting left = mid + 1. 
// If I don't find the key, I return -1. 
// Time complexity is O(log n).

public class BinarySearch {
    public static int bs(int[] arr, int key) {
        if (arr == null || arr.length == 0) {
            return -1;
        }
        int left = 0;
        int right = arr.length-1;

        while (left <= right) {
            int mid = left + (right - left) /2;

            if (arr[mid] == key) {
                return mid;
            }
            else if (arr[mid] < key) {
                left = mid +1;
            } else {
                right = mid -1;
            }
        }

        return -1;
    }

    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};
        int key = 3;

        System.out.println("key is: " + key);
        System.out.println("Key found at index: " +  bs(arr, key));
    }
    
}

