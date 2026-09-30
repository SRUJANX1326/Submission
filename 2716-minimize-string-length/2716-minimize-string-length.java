class Solution {
    public int minimizedStringLength(String s) {
        HashSet<Character> HS=new HashSet();
        for(int i=0;i<s.length();i++){
            HS.add(s.charAt(i));
        }
        return HS.size();
    }
}