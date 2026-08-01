class Solution(object):
    def intersection(self, nums):
        """
        :type nums: List[List[int]]
        :rtype: List[int]
        """
        condition=True
        ans=[]
        for i in range(len(nums[0])):
            condition=True
            for j in range(1,len(nums)):
                if nums[0][i] not in nums[j]:
                    condition=False
                    break    
            if condition==True:
                ans.append(nums[0][i])
        ans.sort()
        return ans
