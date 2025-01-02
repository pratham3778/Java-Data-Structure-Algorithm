/* Example 1:
Input: nums = [3,2,1,5,6,4], k = 2
Output: 6 */
import java.util.*;

public class largestElement {
 //using priorityQueue
 public static int kthelement(int nums[], int k) {
  PriorityQueue<Integer> pq = new PriorityQueue<>();
  for(int i=0;i<k;i++) {
   pq.add(nums[i]);
  }
  for(int i=k;i<nums.length;i++) {
   if(pq.peek() < nums[i]) {
    pq.poll();
    pq.add(nums[i]);
   }
  }
  return pq.peek();
 }

 /*
 //using arrays in built method
  public static int large(int[] nums, int k) {
    Arrays.sort(nums);
    return nums[nums.length-k];
  } */
  public static void main(String[] args) {
    int nums[]= {3,2,1,5,6,4};
    int k = 1;

   int result = kthelement(nums, k);
   System.out.println(result);
    //System.out.println(large(nums,k));
  }
}
