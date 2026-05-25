// Last updated: 5/25/2026, 11:22:20 AM
class Solution {
    public int reverse(int x) {
        int n=x;
        long rev=0;
        while(x!=0){
            int d=x%10;
            rev=rev*10+d;
            x/=10;
        }
        if(rev<=Integer.MAX_VALUE && rev>=Integer.MIN_VALUE)
            return (int)rev;
        else
            return 0;
    }
}