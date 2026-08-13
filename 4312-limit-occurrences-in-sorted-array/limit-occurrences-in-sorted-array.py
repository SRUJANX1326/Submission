class Solution(object):
    def limitOccurrences(self, nums, k):
        freq=dict()
        set_nums=set(nums)
        for x in set_nums:
            freq[x]=nums.count(x)
        res=[]
        for x in set_nums:
            lim=0
            if freq[x]<=k:
                lim=freq[x]
            else:
                lim=k
            for i in range(lim):
                res.append(x)
        res.sort()
        return res
                


        