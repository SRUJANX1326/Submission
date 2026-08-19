class Solution(object):
    def differenceOfSum(self, nums):
        string=''
        for x in nums:
            string+=str(x)
        digit_sum=0
        for x in string:
            digit_sum+=int(x)
        return sum(nums)- digit_sum
        