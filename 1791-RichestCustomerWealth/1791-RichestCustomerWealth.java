// Last updated: 5/25/2026, 11:14:50 AM
class Solution {
    public int maximumWealth(int[][] accounts) {
        // int n=account.length;
        int sum=0;
        for(int i=0;i<accounts.length;i++){
            int current=0;
            for(int j=0;j<accounts[i].length;j++){
                current+=accounts[i][j];
            }
            sum=Math.max(current,sum);
        }
        return sum;
    }
}