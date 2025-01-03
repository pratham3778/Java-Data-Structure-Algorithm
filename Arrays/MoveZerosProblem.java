public class MoveZerosProblem {
    public void moveZeroes(int[] nums) {
        // TWO POINTER APPROACH
        int left = 0;
        int right = 1;

        if (nums.length < 2) {
            return;
        }

        while (right < nums.length) {
            if (nums[left] != 0) {
                left++;
                right++;
            } else if (nums[right] == 0) {
                right++;
            } else {
                int temp = nums[right];
                nums[right] = nums[left];
                nums[left] = temp;
            }
        }
    }

    public static void main(String[] args) {
        MoveZerosProblem mz = new MoveZerosProblem();
      
        int[] nums = {0, 1, 0, 3, 12};
        mz.moveZeroes(nums);
        
        for (int i = 0; i < nums.length; i++) {
            System.out.print(nums[i]);
            if (i < nums.length - 1) {
                System.out.print(", ");
            }
        }
    }
}
