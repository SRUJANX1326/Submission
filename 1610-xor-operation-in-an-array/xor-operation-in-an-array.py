class Solution(object):
    def xorOperation(self, n, start):
        nums=[0]
        
        nums[0]=start + 2 * 0
        ans=nums[0]
        for i in range(1,n):
            nums.append(start + 2 * i)
            ans=nums[i]^ans
        return ans