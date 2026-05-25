// Last updated: 5/25/2026, 11:15:06 AM
class Solution {
    public boolean vowel(char c){
        return c=='a'||c=='e'||c=='i'||c=='o'||c=='u';
    }
    public int maxVowels(String s, int k) {
        int sum=0;
        for(int i=0;i<k;i++){
            if(vowel(s.charAt(i))){
                sum++;
            }
        }
        int max=sum;
        for(int i=k;i<s.length();i++){
            if(vowel(s.charAt(i-k))){
                sum--;
            }
            if(vowel(s.charAt(i))){
                sum++;
            }
            max=Math.max(sum,max);
        }
        return max;
    }
}