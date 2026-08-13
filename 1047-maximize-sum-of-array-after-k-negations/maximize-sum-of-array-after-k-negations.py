class Solution(object):
    def largestSumAfterKNegations(self, nums, k):
        nums.sort()
        i=0
        while i<len(nums) and k>0:
            if nums[i]<0:
                nums[i]=-nums[i]
                k-=1
            i+=1
        if k>0:
            if k%2==0:
                return sum(nums)
            else:
                nums[nums.index(min(nums))]*=-1
        return sum(nums)
            
            
                



        