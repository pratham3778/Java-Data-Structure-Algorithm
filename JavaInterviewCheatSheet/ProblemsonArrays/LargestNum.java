package JavaInterviewCheatSheet;

public class LargestNum {
    public static void main(String[] args) {
        int[] nums = {10,7,23,45,8};

    int largest = nums[0];

    for(int i=1;i<nums.length;i++) {
            if (nums[i] > largest) {
                largest = nums[i];
            }
        }

    System.out.println(largest);
    }

}
