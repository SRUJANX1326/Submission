class Solution(object):
    def divideArray(self, nums):
        for x in nums:
            if nums.count(x)%2!=0:
                return False
        return True
        