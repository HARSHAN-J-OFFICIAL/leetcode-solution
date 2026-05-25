# Last updated: 5/25/2026, 11:20:04 AM
class Solution(object):
    def isPalindrome(self, s):
        a=''
        for i in s:
            if i.isalnum():
                a+=i.lower()
        return a==a[::-1]
        
        """
        :type s: str
        :rtype: bool
        """
        