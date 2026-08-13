class Solution(object):
    def updateListPositive(self,arr,value):
        add= lambda x:x+value
        return list(map(add,arr))
    def updateListNegetive(self,arr,value):
        add= lambda x:x-value
        return list(map(add,arr))
    def addedInteger(self, nums1, nums2):
        nums1.sort()
        nums2.sort()
        if nums1==nums2:
            return 0
        if max(nums1)>=max(nums2):
            m=max(nums1)
        else:
            m=max(nums2)
        for i in range(1,m+1):
            temp=self.updateListPositive(nums1,i)
            if temp==nums2 and nums1[-1]>=nums2[-1]:
                return -i
            elif temp==nums2 and nums1[-1]<=nums2[-1]:
                return i
        for i in range(1,m+1):
            temp=self.updateListNegetive(nums1,i)
            if temp==nums2 and nums1[-1]>=nums2[-1]:
                return -i
            elif temp==nums2 and nums1[-1]<=nums2[-1]:
                return i
        return -12

        

        