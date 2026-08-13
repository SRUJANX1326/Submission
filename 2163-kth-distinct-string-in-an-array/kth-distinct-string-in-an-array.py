class Solution(object):
    def kthDistinct(self, arr, k):
        freq=dict()
        for x in arr:
            if arr.count(x) not in freq:
                freq[arr.count(x)]=[x]
            else:
                freq[arr.count(x)].append(x)
        try:
            return freq[1][k-1]
        except:
            return ""