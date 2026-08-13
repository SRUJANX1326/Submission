class Solution(object):
    def minMoves(self, nums):
        count=0
        m=max(nums)
        for i in range(len(nums)):
            count+=m-nums[i]
        return count
        