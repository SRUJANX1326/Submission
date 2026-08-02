class Solution(object):
    def isMonotonic(self, nums):
        answer=True
        if nums[0]<=nums[-1]:
            for i in range(0,len(nums)-1):
                if nums[i]<=nums[i+1]:
                    pass
                else:
                    answer=False
                    break
        if nums[0]>=nums[-1]:
            for i in range(0,len(nums)-1):
                if nums[i]>=nums[i+1]:
                    pass
                else:
                    answer=False
                    break
        return answer
        