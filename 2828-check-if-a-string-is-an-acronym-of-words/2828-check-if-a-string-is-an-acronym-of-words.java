class Solution {
    public boolean isAcronym(List<String> words, String s) {
        String acronym="";
        for(int i=0;i<words.size();i++){
            acronym+=Character.toString(words.get(i).charAt(0));
        }
        return acronym.equals(s);
    }
}