// Last updated: 5/25/2026, 11:13:55 AM
class Solution {
    public int numberOfCuts(int n) {
        if(n==1){
            return 0;
        }else{
            if(n%2==0){
                return n/2;
            }
            else{
                return n;
            }
        }
    }
}