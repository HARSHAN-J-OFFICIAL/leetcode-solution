// Last updated: 5/25/2026, 11:21:14 AM
class Solution {
    public int lengthOfLastWord(String s) {
        String[] arr=s.split(" ");
        String str=arr[arr.length-1];
        char[] arr1=str.toCharArray();
        int a=arr1.length;
        return a;
    }
}