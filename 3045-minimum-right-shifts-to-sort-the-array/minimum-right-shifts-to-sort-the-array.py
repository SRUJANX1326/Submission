class Solution(object):
    def minimumRightShifts(self, nums):
        sorted_nums=nums[:]
        sorted_nums.sort()
        count=0
        if nums==sorted_nums:
                return count
        for i in range(len(nums)):
            nums=[nums[-1]]+nums[:-1]
            count+=1
            if nums==sorted_nums:
                return count
        return -1
        