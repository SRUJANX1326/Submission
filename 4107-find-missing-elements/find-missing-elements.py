class Solution(object):
    def findMissingElements(self, nums):
        l=min(nums)
        r=max(nums)
        res=[]
        print(r-l)
        if len(nums)!=(r-l+1):
            for i in range(l,r+1):
                print(i)
                if i not in nums:
                    print(i)
                    res.append(i)
            return res
        else:
            return []
        