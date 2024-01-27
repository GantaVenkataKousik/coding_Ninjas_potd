public class Solution {
    public static long getMaximumProfit (int n, long[] prices) {
        long profit = 0;
        for(int i=1 ; i<n  ; i++){
            if(prices[i]>prices[i-1]){
                profit += prices[i]-prices[i-1];
            }
        }
        return profit;
    }
}
