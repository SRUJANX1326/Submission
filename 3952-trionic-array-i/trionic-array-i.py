class Solution(object):
    def isTrionic(self, nums):
        if len(nums)<3:
            return False
        count1=0
        i=0
        while i < len(nums)-1:
            if(nums[i]<nums[i+1]):
                count1+=1
                i+=1
            else:
                break
        if count1==0:
            return False
        count2=0   
        while i < len(nums)-1:
            if(nums[i]>nums[i+1]):

                count2+=1
                i+=1

            else:
                break
        if count2==0:
            return False
        count3=0
        while i < len(nums)-1:
            if(nums[i]<nums[i+1]):

                count3+=1
                i+=1
            else:
                return False
        if count3==0:
            return False
        return True