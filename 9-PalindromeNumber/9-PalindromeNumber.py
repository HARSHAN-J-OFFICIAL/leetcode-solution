# Last updated: 5/25/2026, 11:22:16 AM
class Solution(object):
    def isPalindrome(self, x):
        ori=x
        rev=0
        digit=0
        while x>0:
            digit=x%10
            rev=rev*10+digit
            x//=10
        if ori==rev:
            return True
        else:
            return False


        """
        :type x: int
        :rtype: bool
        """
        