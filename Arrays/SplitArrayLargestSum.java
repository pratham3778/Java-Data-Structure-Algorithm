package Arrays;

public class SplitArrayLargestSum {
    public static int subArray(int[] nums, int sumMax) {
        int count = 1;
        int sum = 0;
        for(int num : nums) {
            if(sum+num <= sumMax) {
                sum += num;
            } else {
                count++;
                sum=num;
            }
        }
        return count;
    }
    public int splitArray(int[] nums, int k) {
        int low = Integer.MIN_VALUE;
        int high = 0;

        for(int num : nums) {
            low = Math.max(low, num);
            high += num;
        }

        while(low <= high) {
            int mid = low + (high-low)/2;
            int count = subArray(nums, mid);

            if(count <= k) {
                high = mid-1;
            } else {
                low = mid + 1;
            }
        }
        return low;
    }

    public static void main(String[] args) {
        SplitArrayLargestSum s = new SplitArrayLargestSum();

        int[] nums = {7, 2, 5, 10, 8};
        int k = 2; 
        System.out.println("Minimum largest sum: " + s.splitArray(nums, k));
    }
}
