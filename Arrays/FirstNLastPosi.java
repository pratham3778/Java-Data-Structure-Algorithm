package Arrays;

public class FirstNLastPosi {

    public int[] searchRange(int[] nums, int target) {
         /* brute force tc : 0(N)
        int first = -1;
        int last = -1;

        for(int i=0;i<nums.length;i++) {
            if(nums[i] == target) {
                if(first == -1) {
                    first = i;
                }
                last = i;
            }
        }
        return new int[]{first,last}; */

        // binary search Time complexity: O(log N)
        int first = firstOcc(nums, target);
        int last = lastOcc(nums, target);

        if(nums.length == 0) {
            return new int[] {-1, -1};
        }

        return new int[]{first, last};
    }

    public int firstOcc(int[] nums, int target) {
        int start = 0;
        int end = nums.length - 1;
        int first = -1;

        while(start <= end) {
            int mid = start + (end - start) / 2;

            if(nums[mid] == target) {
                first = mid;
                end = mid - 1;
            } else if(nums[mid] < target) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }

        return first;
    }

    public int lastOcc(int[] nums, int target) {
        int start = 0;
        int end = nums.length - 1;
        int last = -1;

        while(start <= end) {
            int mid = start + (end - start) / 2;

            if(nums[mid] == target) {
                last = mid;
                start = mid + 1;
            } else if(nums[mid] > target) {
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }
        return last;
    }

    public static void main(String[] args) {
        FirstNLastPosi fnl = new FirstNLastPosi();
        
        int[] nums = {5, 7, 7, 8, 8, 10};
        int target = 8;
        int[] result = fnl.searchRange(nums, target);

        System.out.println("First and Last Position: [" + result[0] + ", " + result[1] + "]"); // Output: [3, 4]
    }
}
