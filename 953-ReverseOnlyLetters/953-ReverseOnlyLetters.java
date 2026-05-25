// Last updated: 5/25/2026, 11:16:09 AM
class Solution {
    public String reverseOnlyLetters(String s) {
        int i=0;
        int j=s.length()-1;
        char a[]=s.toCharArray();
        
        while(i<j){
            if(!((a[i]>='a' && a[i]<='z') || (a[i]>='A' && a[i]<='Z'))){
                i++;
            }
            else if(!((a[j]>='a' && a[j]<='z') || (a[j]>='A' && a[j]<='Z'))){
                j--;
            }
            else{
                char t=a[i];
                a[i]=a[j];
                a[j]=t;
                i++;
                j--;
            }
        }
        String str = String.valueOf(a);
        return str;
    }
}