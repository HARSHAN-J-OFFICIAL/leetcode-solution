// Last updated: 5/25/2026, 11:19:21 AM
class Solution {
    public List<String> findRepeatedDnaSequences(String s) {
        Set<String> hs=new HashSet<>();
        List<String> l=new ArrayList<>();
        if(s.length()<10){
            return l;
        }
        String t="";
        // for(int i=0;i<k;i++){
        //     t=s.substring(0,k);
        // }
        // hs.add(t);
        for(int i=0;i<=s.length()-10;i++){
            t=s.substring(i,i+10);
            if(hs.contains(t) && !(l.contains(t))){
                l.add(t);
            }
            else{
                hs.add(t);
            }
        }
        return l;
    }
}