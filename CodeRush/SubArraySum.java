package CodeRush;

// Return and integer value representing the total number of subarray of size 3 such that the sum of the first element and the third element is equal to the second element
// Input : [1,2,1,3,5,2,4,2] 
// Output : 3
public class SubArraySum {
    public static void main(String[] args) {
        Integer[] arr = {1,2,1,3,5,2,4,2};

        int i = 0;
        int j = 1;
        int count = 0;

        for(int k=2;k<arr.length;k++) {
            if(arr[i] + arr[k] == arr[j]) {
                count++;
            }
            i++;
            j++;
        }

        System.out.println("Total Number Of Sub-Array: " + count);
    }
}
