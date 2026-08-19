class Solution(object):
    def isPrefixString(self, s, words):
        j=0
        count=len(s)
        string=''
        for word in words:
            if count==j:
                break
            if word==s[j:j+len(word)]:
                pass
                j+=len(word) 
                string+=word
            else:
                return False
        if string==s:
            return True
        return False
        