class Solution(object):
    def findMissingElements(self, nums):
        res=[]
        if len(nums)!=(max(nums)-min(nums)+1):
            for i in range(min(nums),max(nums)+1):
                if i not in nums:
                    res.append(i)
            return res
        else:
            return []
        