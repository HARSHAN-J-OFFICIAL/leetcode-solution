// Last updated: 5/25/2026, 11:14:19 AM
class Solution {
    public int timeRequiredToBuy(int[] tickets, int k) {
        Queue<Integer> q=new LinkedList<>();
        for(int i=0;i<tickets.length;i++){
            if(i!=k)
                q.add(tickets[i]);
            else{
                q.add(Integer.MAX_VALUE);
                q.add(tickets[i]);
            }
        }
        int count=0;
        int x=0;
        while(true){
            if(q.peek()==Integer.MAX_VALUE){
                x=q.poll();
                q.add(x);
                if(q.peek()==1){
                    break;
                }
                else{
                    x=q.poll()-1;
                    q.add(x);
                    count++;
                }
            }
            else if(q.peek()>0){
                x=q.poll()-1;
                count++;
                if(x==0){
                    continue;
                }
                else{
                    q.add(x);
                }
            }
        }
        return count+1;
    }
}