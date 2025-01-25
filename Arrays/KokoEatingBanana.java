package Arrays;

public class KokoEatingBanana {
    public int calHour(int[] piles, int eat) {
        int totalHour = 0;
        for(int i : piles) {
            totalHour += Math.ceil((double) i / (double) eat);
        }
        return totalHour;
    }
    public int minEatingSpeed(int[] piles, int h) {
        int n = piles.length;
        int high = 0;
        for(int i : piles) {
            high = Math.max(high, i);
        }

        int low = 1;
        while(low <= high) {
            int mid = low + (high-low)/2;
            int totalHr = calHour(piles, mid);

            if(totalHr <= h) {
                high = mid-1;
            } else {
                low = mid+1;
            }
        }
        return low;
    }
    public static void main(String[] args) {
        KokoEatingBanana s = new KokoEatingBanana();

        int[] piles = {3, 6, 7, 11};
        int h = 8;
        System.out.println("Minimum eating speed: " + s.minEatingSpeed(piles, h));
    }
}
