class Solution(object):
    def maximumValue(self, strs):
        max_len=0
        l=0
        for s in strs:
            if s.isdigit():
                l=int(s)
                
            else:
                l=len(s)
            if max_len<l:
                max_len=l
        return max_len
        