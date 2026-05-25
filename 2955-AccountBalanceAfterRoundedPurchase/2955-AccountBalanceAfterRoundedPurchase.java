// Last updated: 5/25/2026, 11:13:37 AM
class Solution {
    public int accountBalanceAfterPurchase(int p) {
        if(p>=5&&p<=10){
            return 100-10;
        }
        if(p<5){
            return 100;
        }
        if(p%10>=5){
            return (100-(p/10+1)*10);
        }
        return (100-(p/10)*10);
    }
}