class Solution(object):
    def applyOperations(self, nums):
        z=[]
        r=[]
        for i in range(len(nums)-1):
            if nums[i]==nums[i+1]:
                nums[i]*=2
                nums[i+1]=0
        for x in nums:
            if x!=0:
                r.append(x)
            else:
                z.append(0)
        return r+z

                
        
        