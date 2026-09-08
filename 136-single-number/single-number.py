class Solution(object):
    def singleNumber(self, nums):
        temp=set()
        for n in nums:
            if n not in temp:
                temp.add(n)
                continue
            if n in temp:
                temp.remove(n)
        ans=next(iter(temp))
        return ans