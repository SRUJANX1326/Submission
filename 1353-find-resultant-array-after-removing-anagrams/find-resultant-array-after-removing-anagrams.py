class Solution(object):
    def Anagram(self,w1,w2):
        l1=list(w1)
        l2=list(w2)
        l1.sort()
        l2.sort()
        if l1==l2:
            return True
        return False
    def removeAnagrams(self, words):
        ans=words[:]
        for i in range(1,len(words)):
            condition=self.Anagram(words[i-1],words[i])
            if condition==True:
                ans.remove(words[i])
        return ans
       