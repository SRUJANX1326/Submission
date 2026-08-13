class Solution(object):
    def findDisappearedNumbers(self, nums):
        res=[]
        set_nums=set(nums)
        for x in range(1,len(nums)+1):
            if x not in set_nums:
                res.append(x)
        return res