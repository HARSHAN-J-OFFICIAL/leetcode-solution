// Last updated: 5/25/2026, 11:15:04 AM
class Solution {
    public int[] finalPrices(int[] prices) {
        int arr[]=new int[prices.length];
        for(int i=0;i<prices.length;i++){
            int c=0;
            int j=i+1;
            while(j<prices.length){
                if(prices[i]>=prices[j]){
                    arr[i]=prices[i]-prices[j];
                    c=9;
                    break;
                }
                j++;
            }
            if(c==0){
                arr[i]=prices[i];
            }
        }
        return arr;
    }
}