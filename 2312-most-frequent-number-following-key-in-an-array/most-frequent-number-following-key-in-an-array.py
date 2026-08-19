class Solution(object):
    def mostFrequent(self, nums, key):
        count=0
        set_nums=set(nums)
        target=nums[0]
        maximum=0
        for x in set_nums:
            count=0
            for i in range(len(nums)-1):
                if nums[i]==key and nums[i+1]==x:
                    count+=1
            if maximum<count:
                maximum=count
                target=x
        return target

        