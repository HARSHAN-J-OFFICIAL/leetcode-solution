// Last updated: 5/25/2026, 11:18:14 AM
class Solution {
    public boolean isPowerOfFour(int n) {
        if(n<=0){
            return false;
        }
        while(n%4==0){
            n=n/4;
        }
         if(n==1){
            return true;
        }
        return false;
    }
}