class Solution(object):
    def left_answer_function(self,arr):
        for x in arr[1:]:
            if arr[0]<=x:
                return False
        return True
    def right_answer_function(self,arr):
        for x in arr[:-1]:
            if arr[-1]<=x:
                return False
        return True
    def findValidElements(self, nums):
        result=[]
        result.append(nums[0])
        for i in range(1,len(nums)-1):
            if self.left_answer_function(nums[i:]) or self.right_answer_function(nums[:i+1]):
                result.append(nums[i])
        if len(nums)>1:
            result.append(nums[-1])
        return result
        