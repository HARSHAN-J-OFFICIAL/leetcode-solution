// Last updated: 5/25/2026, 11:18:06 AM
class Solution {
    public boolean isPerfectSquare(int num) {
        if(num==0 || num==1){
            return true;
        }
        int low=1,high=num/2;
        while(low<=high){
            int mid=low+(high-low)/2;
            long m=(long)mid*mid;
            if(m==num){
                return true;
            }
            else if(m>num){
                high=mid-1;
            }
            else{
                low=mid+1;
            }
        }
        return false;
        
    }
}