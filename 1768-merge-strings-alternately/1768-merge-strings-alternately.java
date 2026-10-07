class Solution {
    public String mergeAlternately(String word1, String word2) {
        StringBuilder ans=new StringBuilder();
        int i;
        final int one=word1.length();
        final int two=word2.length();
        for(i=0;i<one && i<two;i++){
            ans.append(word1.charAt(i));
            ans.append(word2.charAt(i));
        }
        if(i<one){
            ans.append(word1.substring(i,one));
        }
        if(i<two){
            ans.append(word2.substring(i,two));
        }
        return ans.toString();
        
    }
}