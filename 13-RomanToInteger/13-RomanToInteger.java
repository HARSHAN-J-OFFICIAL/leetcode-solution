// Last updated: 5/25/2026, 11:22:11 AM
class Solution {
    public int romanToInt(String s) {
        int curr=0,sum=0;
        curr=value(s.charAt(0));
        for(int i=1;i<s.length();i++){
            int next=value(s.charAt(i));
            if(curr<next) sum-=curr;
            else sum+=curr;
            curr=next;
        }
        sum+=curr;
        return sum;
    }
    public int value(char ch){
        switch(ch){
            case 'I': return 1;
            case 'V': return 5;
            case 'X': return 10;
            case 'L': return 50;
            case 'C': return 100;
            case 'D': return 500;
            case 'M': return 1000;
            default: return 0;
        }
    }
}