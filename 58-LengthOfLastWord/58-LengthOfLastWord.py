# Last updated: 5/25/2026, 11:21:20 AM
class Solution(object):
    def lengthOfLastWord(self, s):
        s = s.strip()
        words = s.split()
        return len(words[-1])
        """
        :type s: str
        :rtype: int
        """
        