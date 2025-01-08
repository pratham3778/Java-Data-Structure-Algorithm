public class MajorityElement {
  public int majorEle(int[] nums) {
        for(int i = 0; i < nums.length; i++) {
            int count = 0;
            for(int j = 0; j < nums.length; j++) {
                if(nums[j] == nums[i]) {
                    count++;
                }
            }

            if(count > nums.length/2) {
                return nums[i];
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int[] nums = {3, 2, 3};
        MajorityElement me = new MajorityElement();
        int result = me.majorEle(nums);
        System.out.println(result);
    }
}
