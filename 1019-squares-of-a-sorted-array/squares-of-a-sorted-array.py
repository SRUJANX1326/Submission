class Solution(object):
    def square(self,n):
        return n*n
    def sortedSquares(self, nums):
        squared_nums=list(map(self.square,nums))
        squared_nums.sort()
        return squared_nums
        
        