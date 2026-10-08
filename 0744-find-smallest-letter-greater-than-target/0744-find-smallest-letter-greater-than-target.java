class Solution {
    public char nextGreatestLetter(char[] l, char t) {
        for(int i=0;i<l.length;i++){
            if(l[i]>t){
                return l[i];
            }
        }
        return l[0];
    }
}