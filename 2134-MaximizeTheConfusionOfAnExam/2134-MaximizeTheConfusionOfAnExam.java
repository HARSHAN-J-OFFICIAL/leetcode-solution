// Last updated: 5/25/2026, 11:14:22 AM
class Solution {
    public int maxConsecutiveAnswers(String answer, int k) {
        int start=0,c=0;
        int size=0;
        int max=0;
        int n=answer.length();
        int Tcount=0,Fcount=0;
        for(int end=0;end<n;end++){
            if(answer.charAt(end)=='T')
                Tcount++;
            else
                Fcount++;
            while(Math.min(Tcount,Fcount)>k){
                if(answer.charAt(start)=='T'){
                    Tcount--;
                }
                else{
                    Fcount--;
                }
                start++;
            }
            size=end-start+1;
            if(max<size){
                max=size;
            }
        }
        return max;
    }
}