// Last updated: 5/25/2026, 11:13:50 AM
class Solution {
    public int differenceOfSum(int[] nums) {
        int sum=0;
        int sum1=0;
        int d=0;
        for(int i:nums){
            sum+=i;
            while(i>9){
                d=i%10;
                sum1+=d;
                i/=10;
            }
            sum1+=i;
        }
        return sum-sum1;
    }
}