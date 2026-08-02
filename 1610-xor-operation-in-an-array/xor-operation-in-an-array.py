class Solution(object):
    def xorOperation(self, n, start):
        ans=start + 2 * 0
        for i in range(1,n):
            ans=(start + 2 * i)^ans
        return ans