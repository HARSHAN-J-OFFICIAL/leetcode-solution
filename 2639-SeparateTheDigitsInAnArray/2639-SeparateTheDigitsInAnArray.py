# Last updated: 5/25/2026, 11:13:48 AM
class Solution(object):
    def separateDigits(self, nums):
        
        res=[]
        for i in nums:
            for ch in str(i):
                res.append(int(ch))
        return res
            


        
        