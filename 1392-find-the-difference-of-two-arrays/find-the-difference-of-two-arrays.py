class Solution(object):
    def findDifference(self, nums1, nums2):
        element_list_one=[]
        element_list_two=[]
        for i in range(len(nums1)):
            if nums1[i] not in nums2 and nums1[i] not in element_list_one :
                element_list_one.append(nums1[i])
        for i in range(len(nums2)):
            if nums2[i] not in nums1 and nums2[i] not in element_list_two:
                element_list_two.append(nums2[i])
        return [element_list_one,element_list_two]
        