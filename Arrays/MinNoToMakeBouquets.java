package Arrays;

public class MinNoToMakeBouquets {
    public static boolean possible(int[] bloomDay, int day, int k, int m) {
        /*//BRUTE FORCE : TC : (n.maxDay)
        int maxDay = Integer.MIN_VALUE;
        for(int i=0;i<bloomDay.length;i++) {
            maxDay = Math.max(maxDay, bloomDay[i]);
        }
        for(int day=1;day<=maxDay;day++){
            if(possibility(bloomDay, day, m, k)) {
                return day;
            }
        }
        return -1;*/

        int count  = 0;
        int noOfBoquets = 0;
        for(int i=0;i<bloomDay.length;i++) {
            if(bloomDay[i] <= day) {
                count++;
                if(count == k) {
                    noOfBoquets++;
                    count=0;
                }
            } else {
                count = 0;
            }
        }
        return noOfBoquets >= m;
    }
    public int minDays(int[] bloomDay, int m, int k) {
        if((long) m * k > bloomDay.length) {
            return -1;
        }
        int low = Integer.MAX_VALUE;
        int high = Integer.MIN_VALUE;
        for(int day : bloomDay) {
            low = Math.min(low, day);
            high = Math.max(high, day);
        }
        while(low<=high) {
            int mid = low + (high-low)/2;
            if(possible(bloomDay, mid, k, m)) {
                high = mid - 1;
            } else {
                low = mid+1;
            }
        }
        return low;
    }
    public static void main(String[] args) {
        MinNoToMakeBouquets s = new MinNoToMakeBouquets();

        int[] bloomDay = {1, 10, 3, 10, 2};
        int m = 3; 
        int k = 1; 
        System.out.println("Minimum days to make bouquets: " + s.minDays(bloomDay, m, k));
    }
}
