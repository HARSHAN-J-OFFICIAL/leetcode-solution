// Last updated: 5/25/2026, 11:14:23 AM
class Solution {
    public String reversePrefix(String word, char ch) {
        int index=0;
        int flag=0;
        StringBuilder sb=new StringBuilder();
        for(int i=0;i<word.length();i++){
            if(word.charAt(i)==ch){
                 sb.append(word.charAt(i));
                flag=100;
                index=i;
                break;
            }
            else{
                sb.append(word.charAt(i));
            }
        }
        if(flag==0){
            return word;
        }
        else{
            sb.reverse();
        }
        for(int i=index+1;i<word.length();i++){
            sb.append(word.charAt(i));
        }
        return sb.toString();

    }
}