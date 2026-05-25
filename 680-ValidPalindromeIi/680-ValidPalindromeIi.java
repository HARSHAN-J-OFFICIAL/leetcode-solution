// Last updated: 5/25/2026, 11:16:59 AM
class Solution {
    public static int isPalin(char[] arr,int i,int j){
        int start = i;
        int end = j;
        while(start<end){
            if(arr[start] != arr[end]) return 0;
            start++;
            end--;
        }
        return 1;
    }

    public boolean validPalindrome(String A) {
         int start = 0;
        int end = A.length()-1;
        while(start<end){
            if(A.charAt(start) != A.charAt(end)) return ((isPalin(A.toCharArray(),start+1,end) == 1) 
            || (isPalin(A.toCharArray(),start,end-1) == 1) ? true:false);
            start++;
            end--;
        }
        return true;
    }
}