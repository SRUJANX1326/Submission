class Solution(object):
    def canFormArray(self, arr, pieces):
        res=[]
        for i in range(len(arr)):
            for j in range(len(pieces)):
                if arr[i]==pieces[j][0]:
                    res=res+pieces[j]
                    break
            if res[:i]!=arr[:i]:
                return False
        if len(arr)==len(res) and arr==res:
            return True
        return False
        