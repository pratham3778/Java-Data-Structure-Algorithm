package Arrays;

public class KthMissPositiveNum {
    public int findKthPositive(int[] arr, int k) {
     /*for(int i=0;i<arr.length;i++) {
        if(arr[i] <= k) {
            k++;
        } else {
            break;
        }
     }
     return k; */

     int low = 0;
     int high = arr.length-1;
     while(low <= high) {
        int mid = low + (high - low)/2;
        int miss = arr[mid] - (mid+1);
        if(miss < k) {
            low = mid + 1;
        } else {
            high = mid -1;
        }
     }
     return k + low;
    }

    public static void main(String[] args) {
        KthMissPositiveNum s = new KthMissPositiveNum();

        int[] arr = {2, 3, 4, 7, 11};
        int k = 5;
        System.out.println("Kth missing positive number: " + s.findKthPositive(arr, k));
    }
}
