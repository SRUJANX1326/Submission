class Solution {
    public char repeatedCharacter(String s) {
        HashSet<Character> HS=new HashSet();
        for(char c: s.toCharArray()){
            if(!HS.contains(c)){
                HS.add(c);
            }else{
                return c;
            }
        }
        return ' ';
    }
}