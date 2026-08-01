class Solution(object):
    def validMountainArray(self, arr):
        count1=0
        if len(arr)==1 or len(arr)==0:
            return False
        for i in range(len(arr)-1):
            if arr[i]<arr[i+1]:
                count1+=1
                pass
            else:
                if count1==0:
                    return False
                break
        count2=0
        for i in range(count1,len(arr)-1):
            if arr[i]>arr[i+1]:
                pass
                count2+=1
            else:
                return False
        if count2==0:
            return False
        return True

        