class Solution(object):
    def findLucky(self, arr):
        arr.sort(reverse=True)
        for x in arr:
            if x==arr.count(x):
                return x
        return -1

        