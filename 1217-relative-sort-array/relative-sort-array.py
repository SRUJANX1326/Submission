class Solution(object):
    def relativeSortArray(self, arr1, arr2):
        result_arr=[]
        for i in range(len(arr2)):
            while arr2[i] in arr1:
                result_arr.append(arr2[i])
                arr1.remove(arr2[i])
        arr1.sort()
        for i in range(len(arr1)):
            result_arr.append(arr1[i])
        return result_arr