// Last updated: 5/25/2026, 11:16:45 AM
class Solution {
    public char nextGreatestLetter(char[] letters, char target) {
        for(int i=0;i<letters.length;i++){
            if((int)(target)<(int)letters[i]){
                return letters[i];
            }
        }
        return letters[0];
    }
}