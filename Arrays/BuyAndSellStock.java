package Arrays;

public class BuyAndSellStock {
public static int maxProfit(int[] prices) {
        int minProfit = prices[0];
        int maxProfit = 0;
        
        for(int i=1;i<prices.length;i++) {
            int cost = prices[i] - minProfit;
            maxProfit = Math.max(maxProfit, cost);
            minProfit = Math.min(minProfit, prices[i]);
        }
        return maxProfit;
    } 
    public static void main(String[] args) {
        int[] prices = {7,1,5,3,6,4};
        int result = maxProfit(prices);
        
        System.out.println(result);
    }
}


// Time Complexity: 𝑂(𝑛)
// O(n) — Single loop through the array.
// Space Complexity: 𝑂(1)
// O(1) — No extra space used.
