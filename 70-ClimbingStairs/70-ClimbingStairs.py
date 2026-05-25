# Last updated: 5/25/2026, 11:20:59 AM
class Solution(object):
    def climbStairs(self, n):
        if n<=2:
            return n
        a,b=1,2
        for i in range(3,n+1):
            a,b=b,a+b
        return b
        """
        :type n: int
        :rtype: int
        """
        