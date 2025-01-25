package Arrays;

import java.util.Arrays;

public class MagneticForceBetweenTwoBalls {
    public boolean canPlace(int[] position, int m, int d) {
        int count = 1;
        int last = position[0];
        for(int i=1;i<position.length;i++) {
            if(position[i] - last >= d) {
                count++;
                last = position[i];
                if(count == m) {
                    return true;
                }
            }
        }
        return false;
    }
    public int maxDistance(int[] position, int m) {
        Arrays.sort(position);
        int low = 1;
        int high = position[position.length-1] - position[0];
        int ans = 0;

        while(low <= high) {
            int mid = low + (high-low)/2;
            if(canPlace(position, m, mid)) {
                ans = mid;
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        MagneticForceBetweenTwoBalls s = new MagneticForceBetweenTwoBalls();

        int[] position = {1, 2, 8, 4, 9};
        int m = 3;
        System.out.println("Maximum magnetic force: " + s.maxDistance(position, m));
    }
}
