// Last updated: 5/25/2026, 11:20:01 AM
class Solution {
    public int maxProfit(int[] prices) {
        int max=0;
        int buy=prices[0];
        for(int i=1;i<prices.length;i++){
            if(prices[i]<buy)
                buy=prices[i];
            else
                max=Math.max(prices[i]-buy,max);
        }
        return max;
    }

}