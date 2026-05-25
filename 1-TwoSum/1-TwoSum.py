# Last updated: 5/25/2026, 11:22:30 AM
class Solution(object):
    def twoSum(self, nums, target):
        for i in range(len(nums)):
            for j in range(i+1,len(nums)):
                if nums[i]+nums[j]==target:
                    return (i,j)


        """
        :type nums: List[int]
        :type target: int
        :rtype: List[int]
        """
        
