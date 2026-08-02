class Solution(object):
    def stringMatching(self, words):
        hook=[]
        for i in range(len(words)):
            condition=False
            for j in range(len(words)):
                if words[i] in words[j] and len(words[i])!=len(words[j]):
                    hook.append(words[i])
                    break
        return hook


        