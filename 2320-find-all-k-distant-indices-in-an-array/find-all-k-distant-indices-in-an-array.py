class Solution(object):
    def findKDistantIndices(self, nums, key, k):
        l=[]
        for i in range(len(nums)):
            for j in range(len(nums)):
                if abs(i-j)<=k and nums[j]==key:
                    l.append(i)
        l=list(set(l))
        l.sort()
        return l
        