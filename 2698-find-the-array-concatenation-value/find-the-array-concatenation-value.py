class Solution(object):
    def findTheArrayConcVal(self, nums):
        s=0
        for i in range(len(nums)//2):
            if len(nums)!=1:
                s=int(s)+int(str(nums[0])+str(nums[-1]))
                nums.pop(0)
                nums.pop()    
        if len(nums)==1:
            s=int(s)+nums[0]
        return int(s)