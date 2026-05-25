// Last updated: 5/25/2026, 11:15:22 AM
class Solution {
    public int subtractProductAndSum(int n) {
        int d=0;
        int sum=0;
        int pro=1;
        while(n!=0){
            d=n%10;
            sum+=d;
            pro*=d;
            n/=10;
        }
        return pro-sum;
    }
}