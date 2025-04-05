package CodeRush;

import java.util.Arrays;

public class FirstNLastPosi {

    public static int[] searchRange(int[] nums, int target) {
        //TC : 0(N)
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
        return new int[]{first,last};

        //TC: 0(N LOG N)
        //int first = firstOcc(nums, target);
        //int last = lastOcc(nums, target);
        //return new int[]{first, last};
    }

    /*public static int firstOcc(int[] nums, int target) {
        int start = 0, end = nums.length - 1, first = -1;
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (nums[mid] == target) {
                first = mid;
                end = mid - 1;
            } else if (nums[mid] < target) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }
        return first;
    }

    public static int lastOcc(int[] nums, int target) {
        int start = 0, end = nums.length - 1, last = -1;
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (nums[mid] == target) {
                last = mid;
                start = mid + 1;
            } else if (nums[mid] > target) {
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }
        return last;
    }*/

    public static void main(String[] args) {
        int[] nums = {5, 7, 7, 8, 8, 10};
        int target = 8;

        int[] result = searchRange(nums, target);
        System.out.println("First and Last Position: " + Arrays.toString(result));
    }
}
