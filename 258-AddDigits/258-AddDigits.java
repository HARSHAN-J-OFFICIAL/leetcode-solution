// Last updated: 5/25/2026, 11:18:38 AM
class Solution {
    public int addDigits(int n) {
        if(n==0){
            return 0;
        }
        if(n%9==0){
            return 9;
        }
        else{
            return (n%9);
        }
        
    }
}