class Solution(object):
    def findMissingElements(self, nums):
        res=[]
        set_nums=set(nums)
        if len(nums)==(max(nums)-min(nums)+1):
            return []
        else:
            for i in range(min(nums)+1,max(nums)):
                if i not in set_nums:
                    res.append(i)
            return res