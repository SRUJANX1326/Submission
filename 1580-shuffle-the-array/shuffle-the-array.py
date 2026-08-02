class Solution(object):
    def shuffle(self, nums, n):
        i=0
        ans=[]
        while i<n:
            ans.append(nums[i])
            ans.append(nums[i+n])
            i+=1
        return ans
        