// Last updated: 5/25/2026, 11:18:17 AM
class Solution {
    public boolean isPowerOfThree(int n) {
         if(n==0) return false;
        while(n%3==0){
            n/=3;
        }
        return n==1;
    }
}