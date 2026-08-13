class Solution(object):
    def check(self, nums):
        rotator=nums[:]
        nums.sort()
        for i in range(len(nums)):
            if rotator==nums:
                return True
            rotator=rotator[1:]+[rotator[0]]
        return False

        