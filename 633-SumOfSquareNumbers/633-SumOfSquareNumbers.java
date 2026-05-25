// Last updated: 5/25/2026, 11:17:07 AM
class Solution {
    public boolean judgeSquareSum(int c) {
        int i=0;
        int j=(int)(Math.sqrt(c));
        while(i<=j){
            long sq=(long)(i*i)+(long)(j*j);
            if(sq==c){
                return true;
            }
            else if(sq<c){
                i++;
            }
            else{
                j--;
            }
        }
        return false;
    }
}