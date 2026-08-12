class Solution(object):
    def isGood(self, nums):
        nums.sort()
        if nums==[1,1]:
            return True
        if nums[-1]!=len(nums)-1:
            return False
        for i in range(len(nums)-1):
            if i+1==nums[i]:
                pass
            else:
                return False
        return True
            
        