package JavaInterviewCheatSheet;

import java.util.Arrays;

public class FirstnLast {
    // TC : 0(n)
    public static int[] posi(int[] nums, int target) {
        int start = -1;
        int end = -1;

        for(int i=0;i<nums.length;i++) {
            if (nums[i] == target) {
                if (start == -1) {
                    start = i;
                }
                end = i;
            }
        }
        return new int[]{start, end};
    }


    // BINARY SEARCH : 0(N LOG N)
    public static int first(int[] nums, int target) {
        int s = 0;
        int e = nums.length-1;
        int first = -1;

        while (s <= e) {
            int mid = s + (e-s)/2;

            if (nums[mid] == target) {
                first = mid;
                e = mid - 1;
            } else if(nums[mid] < target) {
               s = mid + 1;
            } else {
                e = mid - 1;
            }
        }
        return first;
    }

    public static int last(int[] nums, int target) {
        int s = 0;
        int e = nums.length-1;
        int last = -1;

        while (s <= e) {
            int mid = s + (e-s)/2;

            if (nums[mid] == target) {
                last = mid;
                s = mid + 1;
            } else if(nums[mid] < target) {
               s = mid + 1;
            } else {
                e = mid - 1;
            }
        }
        return last;
    }

    public static int[] search(int[] nums, int target) {
        int first = first(nums, target);
        int last = last(nums, target);

        return new int[] {first, last};
    }
    public static void main(String[] args) {
        int[] nums = {2,3,4,2,3,3,3,3};
        int target = 3;
        Arrays.sort(nums); // {2,2,3,3,3,3,3,4}

        int[] result = search(nums, target);
        //posi(nums, target);
        System.out.println(Arrays.toString(result));
        //System.out.println(posi(nums, target));
    }
}
