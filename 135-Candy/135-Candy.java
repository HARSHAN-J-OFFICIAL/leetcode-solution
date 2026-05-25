// Last updated: 5/25/2026, 11:19:52 AM
class Solution {
    public int candy(int[] ratings) {
        int c[]=new int[ratings.length];
        Arrays.fill(c,1);
        for(int i=1;i<ratings.length;i++){
            if(ratings[i]>ratings[i-1])
                c[i]=c[i-1]+1;
        }

        for(int i=ratings.length-2;i>=0;i--){
            if(ratings[i]>ratings[i+1])
                c[i]=Math.max(c[i],c[i+1]+1);
        }
        int ca=0;
        for(int i=0;i<ratings.length;i++)
            ca+=c[i];

        return ca;
    }
}