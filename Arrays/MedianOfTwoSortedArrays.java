package Arrays;

public class MedianOfTwoSortedArrays {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        /*ArrayList<Integer> nums3 = new ArrayList<>();
        int n1 = nums1.length;
        int n2 = nums2.length;

        int i=0;
        int j=0;
        while(i < n1 && j < n2) {
            if(nums1[i] < nums2[j]) {
                nums3.add(nums1[i++]);
            } else {
                nums3.add(nums2[j++]);
            }
        }
        while(i < n1) {
            nums3.add(nums1[i++]);
        }
        while(j < n2) {
            nums3.add(nums2[j++]);
        }
        int n = n1+n2;
        if(n % 2 == 1) {
            return nums3.get(n/2);
        } 
        return (nums3.get(n/2) + nums3.get(n/2-1)) / 2.0; */

        //BETTER - without arrylist
        /*int n1 = nums1.length;
        int n2 = nums2.length;
        int n = n1+n2;
        int[] n3 = new int[n];

        int i=0,j=0,k=0;

        while(i < n1 && j< n2) {
            if(nums1[i] < nums2[j]) {
                    n3[k++] = nums1[i++];
                }
            else {
                n3[k++] = nums2[j++];
            }
        }

            while(i < n1) {
                n3[k++] = nums1[i++];
            } 
            while (j< n2){
                n3[k++] = nums2[j++];
            }

        if(n%2==1) {
            return n3[n/2];
        } 
        return(n3[n/2-1] + n3[n/2])/2.0; */

        //OPTIMAL - BS
        int n1 = nums1.length;
        int n2 = nums2.length;

        if (n1 > n2) {
        return findMedianSortedArrays(nums2, nums1);
        }

        int n = n1 + n2;
        int left = (n + 1) / 2;

        int low = 0, high = n1;
        while (low <= high) {
        int mid1 = low + (high - low) / 2;
        int mid2 = left - mid1;

        int left1 = (mid1 > 0) ? nums1[mid1 - 1] : Integer.MIN_VALUE;
        int left2 = (mid2 > 0) ? nums2[mid2 - 1] : Integer.MIN_VALUE;
        int right1 = (mid1 < n1) ? nums1[mid1] : Integer.MAX_VALUE;
        int right2 = (mid2 < n2) ? nums2[mid2] : Integer.MAX_VALUE;

            if (left1 <= right2 && left2 <= right1) {
                if (n % 2 == 0) {
                    return (Math.max(left1, left2) + Math.min(right1, right2)) / 2.0;
                } else {
                    return Math.max(left1, left2);
                }
            } else if (left1 > right2) {
                high = mid1 - 1;
            } else {
                low = mid1 + 1;
            }
        }
    return 0;
    }

    public static void main(String[] args) {
        MedianOfTwoSortedArrays s = new MedianOfTwoSortedArrays();

        int[] nums1 = {1, 3};
        int[] nums2 = {2};
        System.out.println("Median: " + s.findMedianSortedArrays(nums1, nums2));
    }
}
