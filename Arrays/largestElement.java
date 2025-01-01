/* Example 1:
Input: nums = [3,2,1,5,6,4], k = 2
Output: 5 */
 
public class largestElement {
  public static int large(int[] nums, int k) {
    Arrays.sort(nums);
    return nums[nums.length-k];
  }
  public static void main(String[] args) {
    int nums[]= {3,2,1,5,6,4};
    int k = 2;

    System.out.println(large(nums,k));
  }
}
