class Solution(object):
    def arrayRankTransform(self, arr):
        rank=dict()
        arr_dup=arr[:]
        arr_dup.sort()
        rank_count=1
        for x in arr_dup:
            if x not in rank:
                rank[x]=rank_count
                rank_count+=1
        for i in range(len(arr)):
            arr[i]=rank[arr[i]]
        return arr

        