class Solution(object):
    def divideArray(self, nums):
        nums_set=set(nums)
        for x in nums_set:
            if nums.count(x)%2!=0:
                return False
        return True
        