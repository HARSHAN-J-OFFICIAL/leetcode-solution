// Last updated: 5/25/2026, 11:19:13 AM
class Solution {
    int add(int n){
        int sum=0;
        while(n!=0){
            sum=sum+(n%10)*(n%10);
            n/=10;
        }
        return sum;
    }
    public boolean isHappy(int n) {
        while(n>9){
            n=add(n);
        }
        if(n==1||n==7){
            return true;
        }else{
            return false;
        }
    }
}