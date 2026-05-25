// Last updated: 5/25/2026, 11:16:19 AM
class Solution {
    public int numRescueBoats(int[] people, int limit) {
        int c=0;
        int i=0;
        int j=people.length-1;
        int w=people[0];
        Arrays.sort(people);
        while(i<=j){
            if(people[i]+people[j]<=limit){
                c++;
                i++;
                j--;
            }
            else{
                c++;
                j--;
            }
            // else{

            // }
            
        }
        return c;
    }
}