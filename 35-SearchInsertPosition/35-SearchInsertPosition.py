# Last updated: 5/25/2026, 11:21:43 AM
class Solution(object):
    def searchInsert(self, nums, target):
        for i in range(len(nums)):
            if nums[i]>=target:
                return i
        return len(nums)
        """
        :type nums: List[int]
        :type target: int
        :rtype: int
        """
        