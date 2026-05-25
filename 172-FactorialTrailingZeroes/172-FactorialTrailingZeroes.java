// Last updated: 5/25/2026, 11:19:30 AM
class Solution {
    public int trailingZeroes(int n) {
        int sum=0;
        while(n>4){
            sum=sum+(n/5);
            n=n/5;
        }
        return sum;


// Another method of answer        
        // if(n<5){
        //     return 0;
        // }
        // int sum=0;
        // int m=5;
        // while(true){
        //     sum+=n/m;
        //     m*=5;
        //     if(n/m==0){
        //         break;
        //     }
        // }
        // return sum;
    }
}