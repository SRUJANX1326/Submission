class Solution(object):
    def cut(self,arr):
        try:
            return arr[3:]
        except:
            return []
    def minimumOperations(self, nums):
        count=0
        i=0
        while i<len(nums):
            if nums.count(nums[i])>1:
                nums=self.cut(nums)
                i=0
                count+=1
            i+=1
        return count
        
        