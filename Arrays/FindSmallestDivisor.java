package Arrays;

public class FindSmallestDivisor {
    public static int divisor(int[] nums, int d) {
        int totalSum =0;
        for(int num: nums) {
            totalSum += (int) Math.ceil((double)num/d);
        }
        return totalSum;
    }
    public int smallestDivisor(int[] nums, int threshold) {
        //brute forcev - time limit exceed
        /*int max = Integer.MIN_VALUE;
        for(int num : nums) {
            max = Math.max(max, num);
        }

        for(int day=1;day<=max;day++) {
            int sum = 0;
            for(int num : nums) {
                sum += (int) Math.ceil((double)num/day);
            }
            if(sum <= threshold) {
                return day;
            }
        }
        return max; */

        int low = 1;
        int high = Integer.MAX_VALUE;
        int ans = -1;

        while(low <= high) {
            int mid = low +(high-low)/2;
            int sum = divisor(nums, mid);
            if(sum <= threshold) {
                ans = mid;
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        FindSmallestDivisor s = new FindSmallestDivisor();

        int[] nums = {1, 2, 5, 9};
        int threshold = 6;
        System.out.println("Smallest divisor: " + s.smallestDivisor(nums, threshold));
    }
}
