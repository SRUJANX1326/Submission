class Solution(object):
    def numberOfPairs(self, nums):
        freq=dict()
        for x in nums:
            freq[x]=nums.count(x)
        count_pair,count_remaining=(0,0)
        for x in freq:
            if freq[x]>=2 and freq[x]%2==0:
                count_pair+=freq[x]/2
            elif freq[x]>2 and freq[x]%2!=0:
                count_pair+=(freq[x]-1)/2
                count_remaining+=1
            else:
                count_remaining+=1
        return [count_pair,count_remaining]


        