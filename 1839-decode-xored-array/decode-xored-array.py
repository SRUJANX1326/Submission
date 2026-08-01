class Solution(object):
    def decode(self, encoded, first):
        arr=[]
        arr.append(first)
        arr.append(encoded[0]^first)
        for i in range(1,len(encoded)):
            arr.append(encoded[i]^arr[i])
        return arr
        
        