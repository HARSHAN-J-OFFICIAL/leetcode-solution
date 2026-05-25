// Last updated: 5/25/2026, 11:16:12 AM
class Solution {
    public int totalFruit(int[] f) {
        int c=0;
        int i=0;
        int max=0;
        Map<Integer,Integer> hs=new HashMap<>();
        for(int e=0;e<f.length;e++){
            hs.put(f[e],hs.getOrDefault(f[e],0)+1);
            while(hs.size()>2){
                hs.put(f[i],hs.get(f[i])-1);
                if(hs.get(f[i])==0){
                    hs.remove(f[i]);
                }
                i++;
            }
            max=Math.max(max,e-i+1);

        }
        return max;
    }
}