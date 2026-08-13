class Solution(object):
    def largest_equal(self,n1,n2):
        s1=str(n1)
        s2=str(n2)
        l1=list(map(int,list(s1)))
        l2=list(map(int,list(s2)))
        print(s1,s2)
        if max(l1)==max(l2):
            return True
        return False

    def maxSum(self, nums):
        max=0
        for i in range(len(nums)):
            for j in range(i+1,len(nums)):
                if nums[i]+nums[j]>max and self.largest_equal(nums[i],nums[j]):
                    max=nums[i]+nums[j]
        if max>0:
            return max
        return -1

        