// Last updated: 5/25/2026, 11:15:10 AM
class Solution {
    public int maxScore(int[] card, int k) {
        int sum=0;
        for(int i=0;i<k;i++){
            sum+=card[i];
        }
        int max=sum;
        for(int i=1;i<=k;i++){
            sum=sum-card[k-i]+card[card.length-i];
            max=Math.max(sum,max);
        }
        return max;
    }
}