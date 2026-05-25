// Last updated: 5/25/2026, 11:20:56 AM
class Solution {
    public int mySqrt(int x) {
        int low=0,high=x,res=-1;
        while(low<=high){
            int mid=(low+high)/2;
            long m=(long)mid*mid;
            if(m==x){
                return mid;
            }
            else if(m<x){
                res=mid;
                low=mid+1;
                
            }
            else{
                high=mid-1;
            }
        }
        return res;
    }
}