class Solution(object):
    def findKDistantIndices(self, nums, key, k):
        s=set()
        for i in range(len(nums)):
            for j in range(len(nums)):
                if abs(i-j)<=k and nums[j]==key:
                    s.add(i)
        l=list(s)
        l.sort()
        return l
        