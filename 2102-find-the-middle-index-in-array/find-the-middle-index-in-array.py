class Solution(object):
    def findMiddleIndex(self, nums):
        if 0==sum(nums[1:]):
            return 0
        for i in range(1,len(nums)-1):
            if sum(nums[:i])==sum(nums[i+1:]):
                return i
        if 0==sum(nums[:-1]):
            return len(nums)-1
        return -1
        