// Last updated: 5/25/2026, 11:13:53 AM
class Solution {
    public int countDigits(int num) {
        if(num<10){
            return 1;
        }
        int d=0;
        int count=0;
        int num1=num;
        while(num!=0){    //12
            d=num%10;    //2
            if(num1%d==0){
                count++;    //2
            }
            num/=10;      //12
        }
        return count;
    }
}