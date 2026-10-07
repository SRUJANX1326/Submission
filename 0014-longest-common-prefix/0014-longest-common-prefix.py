class Solution:
    def longestCommonPrefix(self, strs: List[str]) -> str:
        length=len(min(strs,key=len))
        if length==0:
            return ""
        A=[]
        condition=True
        i=0
        while condition:
            for s in strs:
                if strs[0][i]==s[i]:
                   pass
                else:
                    return "".join(A)
            A.append(strs[0][i])
            i+=1
            if i>=length:
                condition=False
        return "".join(A)