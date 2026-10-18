class Solution {
    public char repeatedCharacter(String s) {
        HashSet<Character> HS=new HashSet();
        for(int i=0;i<s.length();i++){
            if(!HS.contains(s.charAt(i))) HS.add(s.charAt(i));
            else return s.charAt(i);
        }
        return ' ';
    }
}