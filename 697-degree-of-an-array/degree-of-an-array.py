import math
class Solution(object):
    def findShortestSubArray(self, nums):
        items=[]
        dup=[]
        degree=nums.count(nums[0])
        nums_set=set(nums)
        nums_list=list(nums_set)
        for i in range(len(nums_list)):
            if nums.count(nums_list[i])>=degree:
                if nums_list[i] in items:
                    pass
                elif nums_list[i] not in items and nums.count(nums_list[i])==degree:
                    items.append(nums_list[i])
                elif nums_list[i] not in items and nums.count(nums_list[i])>=degree:
                    items=dup[:]
                    items.append(nums_list[i])
                    degree=nums.count(nums_list[i])

        min_degree=float('inf')
        if len(items)>1:
            while len(items)>0:
                i=0
                j=len(nums)-1
                while True:
                    if nums[i]!=items[0]:
                        i+=1
                    else:
                        break
                while True:
                    if nums[j]!=items[0]:
                        j-=1
                    else:
                        break
                items.remove(items[0])
                temp=j-i+1
                if min_degree>temp:
                    min_degree=temp  

                print(temp,min_degree)            
        else:
            i=0
            j=len(nums)-1
            while True:
                if nums[i]!=items[0]:
                    i+=1
                else:
                    break
            while True:
                if nums[j]!=items[0]:
                    j-=1
                else:
                    break
            min_degree=j-i+1
        return min_degree

        