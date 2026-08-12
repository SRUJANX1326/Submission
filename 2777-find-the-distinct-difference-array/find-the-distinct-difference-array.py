class Solution(object):
    def distinctDifferenceArray(self, nums):
        diff=list()
        for i in range (0,len(nums)):
            diff.append(len(set(nums[0:i+1]))-len(set(nums[i+1:])))
        return diff