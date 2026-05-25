// Last updated: 5/25/2026, 11:14:16 AM
class Solution {
    public boolean isSameAfterReversals(int num) {
        if(num==0){
            return true;
        }
        return !(num%10==0);
    }
}