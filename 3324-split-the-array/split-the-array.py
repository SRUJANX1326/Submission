class Solution(object):
    def isPossibleToSplit(self, nums):
        nums1=list()
        nums2=list()
        condition=True
        nums.sort()
        for i in range(len(nums)):
            if nums[i] not in nums1 and condition==True:
                nums1.append(nums[i])
                print(nums1,nums2,condition)
                if condition==True:
                    condition=False
                else:
                    condition=True
            elif nums[i] not in nums2 and condition==False:
                nums2.append(nums[i])
                print(nums1,nums2,condition)
                if condition==True:
                    condition=False
                else:
                    condition=True
            elif nums[i] not in nums1 and condition==False:
                nums1.append(nums[i])
            elif nums[i] not in nums2 and condition==True:
                nums2.append(nums[i])
            else:
                return False
        if len(nums1)==len(nums2):
            return True
        else:
            print(nums1,nums2)
            return False
