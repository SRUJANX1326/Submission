class Solution(object):
    def signFunc(self,n):
        if n>0:
            return 1
        elif n<0:
            return -1
        return 0
    def arraySign(self, nums):
        ip=1
        for x in nums:
            ip=ip*x
        return self.signFunc(ip)