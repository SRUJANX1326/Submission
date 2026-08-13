class Solution(object):
    def separateDigits(self, nums):
        s=''
        for x in nums:
            s=s+str(x)
        return list(map(int,list(s)))
        