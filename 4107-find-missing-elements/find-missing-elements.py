class Solution(object):
    def findMissingElements(self, nums):
        res=[]
        if len(nums)!=(max(nums)-min(nums)+1):
            for i in range(min(nums)+1,max(nums)):
                if i not in nums:
                    res.append(i)
            return res
        else:
            return []
        