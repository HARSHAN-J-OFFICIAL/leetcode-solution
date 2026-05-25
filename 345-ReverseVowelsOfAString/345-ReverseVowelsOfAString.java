// Last updated: 5/25/2026, 11:18:11 AM
class Solution {
    public String reverseVowels(String s) {
        char[] arr=s.toCharArray();
        int i=0;
        int j=s.length()-1;
        String vowels = "aeiouAEIOU";
        while(i<j){
            while(i<j && vowels.indexOf(arr[i]) == -1){
                i++;
            }
             while(i<j && vowels.indexOf(arr[j]) == -1){
                j--;
            }
            char t=arr[i];
            arr[i]=arr[j];
            arr[j]=t;
            i++;
            j--;
            
        }
        s=String.valueOf(arr);
        return s;
    }
}