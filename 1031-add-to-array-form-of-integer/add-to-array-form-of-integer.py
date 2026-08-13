class Solution(object):
    def addToArrayForm(self, num, k):
        string=''
        for x in num:
            string=string+str(x)
        integer=int(string)+k
        string=str(integer)
        arrayForm=[]
        for x in string:
            arrayForm.append(int(x))
        return  arrayForm

        
        