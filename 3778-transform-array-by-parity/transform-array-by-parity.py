class Solution(object):
    def transformArray(self, nums):
        result=[]
        for i in range(len(nums)):
            if nums[i]%2==0:
                result.insert(0,0)
            else:
                result.append(1)
        return result
        