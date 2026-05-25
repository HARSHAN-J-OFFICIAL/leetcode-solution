// Last updated: 5/25/2026, 11:13:59 AM
class Solution {
    public int commonFactors(int a, int b) {
        int count=1;
        for(int i=2;i<=a&&i<=b;i++){
            if(a%i==0 && b%i==0){
                count++;
            }
        }
        return count;
    }
}