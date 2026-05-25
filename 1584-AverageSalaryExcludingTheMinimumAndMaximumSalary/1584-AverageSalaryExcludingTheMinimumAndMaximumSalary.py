# Last updated: 5/25/2026, 11:15:03 AM
class Solution(object):
    def average(self, salary):
        salary.remove(max(salary))        
        salary.remove(min(salary))
        t=len(salary)
        s=sum(salary)/float(t)
        return s
        """
        :type salary: List[int]
        :rtype: float
        """
        