# Last updated: 5/25/2026, 11:21:55 AM
class Solution(object):
    def removeDuplicates(self, nums):
        if not nums:
            return 0

        i = 0  # slow pointer
        for j in range(1, len(nums)):  # fast pointer
            if nums[j] != nums[i]:
                i += 1
                nums[i] = nums[j]

        return i + 1  # number of unique elements
