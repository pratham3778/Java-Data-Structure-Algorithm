/* Input: nums = [2,7,11,15], target = 9
Output: [0,1]
Explanation: Because nums[0] + nums[1] == 9, we return [0, 1]. */

package Arrays;
import java.util.*;

class TwoSum {
    public static int[] twoSum(int arr[], int target) {
        /* BRUTE FORCE APPROCH :- 
        for(int i=0;i<arr.length;i++) {
            for(int j=i+1;j<arr.length;j++) {
                if(arr[i] + arr[j] == target) {
                    return new int[]{i,j};
                }
            }
        }
        return new int[]{-1,-1}; */

      /* OPTIMIZED USING HASHING METHOD*/
      HashMap<Integer, Integer> map = new HashMap<>();
      
        for(int i=0;i<arr.length;i++) {
            int complement = target - arr[i];
        
        if(map.containsKey(complement)) {
            return new int[] {map.get(complement), i};
        }
        map.put(nums[i], i);
    }
    return new int[] {-1,-1};
    }
    
    public static void main(String[] args) {
        int arr[] = {2,6,5,8,11};
        int target = 14;
        
        int[] result = twoSum(arr,target);
        System.out.println("Indices: " + result[0]+ "," + result[1]);
    }
}
