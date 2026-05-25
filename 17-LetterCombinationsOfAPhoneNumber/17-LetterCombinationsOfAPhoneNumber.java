// Last updated: 5/25/2026, 11:22:04 AM
class Solution {
    List<String> res=new ArrayList<>();
    Map<Character,String> hs=new HashMap<>();
    public void backTracking(int index,StringBuilder s,String digits){
        if(s.length()==digits.length()){
            res.add(s.toString());
            return;
        }
        for(char i:hs.get(digits.charAt(index)).toCharArray()){
            s.append(i);
            backTracking(index+1,s,digits);
            s.deleteCharAt(s.length()-1);
        }
    }
    public List<String> letterCombinations(String digits) {
        int n=digits.length();
        if(n==0)
            return res;
        hs.put('2',"abc");
        hs.put('3',"def");
        hs.put('4',"ghi");
        hs.put('5',"jkl");
        hs.put('6',"mno");
        hs.put('7',"pqrs");
        hs.put('8',"tuv");
        hs.put('9',"wxyz");
        StringBuilder s=new StringBuilder();
        backTracking(0,s,digits);
        return res;
    }
}