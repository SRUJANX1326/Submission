class Solution(object):
    def concatWithReverse(self, nums):
        ans=nums[:]+nums[::-1]
        return ans
        