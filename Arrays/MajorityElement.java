package Arrays;

public class MajorityElement {
    public int majorityElement(int[] nums) {
        /*BRUTE FORCE
        int n = nums.length;
        for(int i=0;i<n;i++) {
            int count = 0;
            for(int j=0;j<n;j++) {
                if(nums[j] == nums[i]) {
                    count++;
                }
            }
            if(count > n/2) {
                return nums[i];
            }
        }
        return -1; */

        //USING HASHMAP
        /*HashMap<Integer, Integer> mp = new HashMap<>();
        int n = nums.length;
        for(int i=0;i<n;i++) {
            int value = mp.getOrDefault(nums[i], 0);
            mp.put(nums[i], value+1);
        }

        for(Map.Entry<Integer, Integer> it : mp.entrySet()) {
            if(it.getValue() > n/2) {
                return it.getKey();
            }
        }
        return -1; */

        /* MOORE VOTING ALGO */
        int count = 0;
        int elmt = -1;
        for(int i=0;i<nums.length;i++) {
            if(count == 0) {
                count++;
                elmt = nums[i];
            } else if(nums[i] == elmt) {
                count++;
            } else {
                count--;
            }
        }
        int result = 0;
        for(int i=0;i<nums.length;i++) {
            if(nums[i] == elmt) {
                result++;
            }
        } 
        if(result > (nums.length/2)) {
            return elmt;
        } else {
            return -1;
        }
    }

    public static void main(String[] args) {
        MajorityElement me = new MajorityElement();

        int[] nums = {3, 3, 4, 2, 4, 4, 2, 4, 4};
        int result = me.majorityElement(nums);

        System.out.println("The majority element is: " + result);
    }
}
