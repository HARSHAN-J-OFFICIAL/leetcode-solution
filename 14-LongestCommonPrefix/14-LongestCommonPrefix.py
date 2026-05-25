# Last updated: 5/25/2026, 11:22:10 AM
class Solution(object):
    def longestCommonPrefix(self, strs):
        if not strs:
            return ""
        prefix=strs[0]
        for word in strs[1:]:
            while not word.startswith(prefix):
                prefix=prefix[:-1]
                if not prefix:
                    return ""
        return prefix

        # nonono
        """
        :type strs: List[str]
        :rtype: str
        """
        