// Last updated: 5/25/2026, 11:18:20 AM
class Solution {
    public int bulbSwitch(int n) {
        return (int) Math.sqrt(n);
    }
}




//1 1 1 1 1=>round 1(all bulbs on)
//1 0 1 0 1=>round 2(2nd bulbs off)
//1 0 0 0 1=>round 3(toggle ith round bulb)
//1 0 0 1 1=>round 4(toggle 4th bulb)
//1 0 0 1 0=>round 5(toggle 5th bulb)

//=2