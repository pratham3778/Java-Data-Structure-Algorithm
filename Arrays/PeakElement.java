package Arrays;

public class PeakElement {
    public int findPeakElement(int[] nums) {
        int n = nums.length;
        /*//brute force 
        for(int i=0;i<n;i++) {
            if((i==0 || nums[i-1] < nums[i]) && (i==n-1 || nums[i] > nums[i+1])) {
                return i;
            }
        } 
        return -1*/


        if(n == 1) {
            return 0;
        }
        if(nums[0] > nums[1]) {
            return 0;
        }
        if(nums[n-1] > nums[n-2]) {
            return n-1;
        }
        int low = 0;
        int high = n-1;

        while(low < high) {
            int mid = low + (high-low)/2;

            if(nums[mid] > nums[mid+1]) {
                high = mid;
            } else {
                low = mid + 1;
            }
        }
        return low;
    }
    public static void main(String[] args) {
        PeakElement s = new PeakElement();
        
        int[] nums1 = {1, 2, 3, 1};
        System.out.println("Peak element index: " + s.findPeakElement(nums1));

    }
}
