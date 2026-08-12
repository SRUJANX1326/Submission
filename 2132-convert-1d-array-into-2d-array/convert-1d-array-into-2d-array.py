class Solution(object):
    def construct2DArray(self, original, m, n):
        l=[[]]
        i=0
        for x in range(m):
            for y in range(n):
                if  y==0 and i<len(original):
                    l.append(list())
                    l[-1].append(original[i])
                    i+=1
                elif y!=0 and i<len(original):
                    l[-1].append(original[i])
                    i+=1
                elif i>=len(original):
                    return []
        l.remove(l[0])
        if m*n<len(original):
            return []
        return l





        