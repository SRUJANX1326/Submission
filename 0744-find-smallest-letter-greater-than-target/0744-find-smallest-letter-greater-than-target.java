class Solution {
    public char nextGreatestLetter(char[] l, char t) {
        HashSet<Character> HS=new HashSet();
        for(int i=0;i<l.length;i++){
            HS.add(l[i]);
        }
        for(int i=t+1;i<=Integer.MAX_VALUE;i++){
            if(HS.contains((char)i)) return (char)i;
        }
        return l[0];
    }
}