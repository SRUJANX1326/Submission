class Solution {
    public String mergeAlternately(String word1, String word2) {
        String ans="";
        int i,j;
        int one=word1.length();
        int two=word2.length();
        for(i=0;i<one && i<two;i++){
            ans+=""+word1.charAt(i)+word2.charAt(i);
        }
        while(i<one){
            ans+=""+word1.charAt(i);
            i++;
        }
        while(i<two){
            ans+=""+word2.charAt(i);
            i++;
        }
        return ans;
        
    }
}