class Solution(object):
    def repeatedNTimes(self, nums):
        for x in nums:
            if nums.count(x)>=2:
                return x
        