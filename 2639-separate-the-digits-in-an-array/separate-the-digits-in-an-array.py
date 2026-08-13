class Solution(object):
    def separateDigits(self, nums):
        s=''
        for x in nums:
            s=s+str(x)
        ans=list(map(int,list(s)))
        return ans
        