class Solution(object):
    def getMaximumGenerated(self, n):
        if n==0:
            return 0
        nums=[0,1]
        for i in range(2,n+1):
            nums.append(0)
        condition=True
        for i in range(0,(n+1)//2):
            temp=2 * i
            nums[temp]=nums[i]
            nums[temp+1]=nums[i] + nums[i + 1]
        return max(nums)

        