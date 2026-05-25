# Last updated: 5/25/2026, 11:21:54 AM
class Solution(object):
    def removeElement(self, nums, val):
        i=0
        for num in nums:
            if num!=val:
                nums[i]=num
                i+=1
        return i
        """
        :type nums: List[int]
        :type val: int
        :rtype: int
        """
        