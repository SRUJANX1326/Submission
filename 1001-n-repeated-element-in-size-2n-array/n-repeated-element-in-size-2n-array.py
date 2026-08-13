class Solution(object):
    def repeatedNTimes(self, nums):
        set_nums=set()
        for x in nums:
            if x in set_nums:
                return x
            else:
                set_nums.add(x)
        