class Solution(object):
    def targetIndices(self, nums, target):
        for i in range(len(nums)):
            for j in range(len(nums)):
                if nums[i]<nums[j]:
                    temp=nums[i]
                    nums[i]=nums[j]
                    nums[j]=temp
        res=[]
        for i in range(len(nums)):
            if nums[i]==target:
                res.append(i)
        return res
        